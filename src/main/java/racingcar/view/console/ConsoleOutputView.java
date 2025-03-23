package racingcar.view.console;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.domain.car.CarName;
import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;
import racingcar.dto.response.WinnersResponse;
import racingcar.global.message.OutputMessage;
import racingcar.view.OutputView;

public class ConsoleOutputView implements OutputView {
    @Override
    public void printExecutionResults(ExecutionResultsResponse executionResults, TrialCountRequest trialCount) {
        final String LOCATION_CHARACTER = "-";
        System.out.println(OutputMessage.EXECUTION_RESULT.message());
        IntStream.range(0, trialCount.toEntity().value()).forEach(currentCount -> {
                    executionResults.executionResults().forEach((carName, locations) -> {
                        System.out.printf("%s : %s\n", carName.name(),
                                LOCATION_CHARACTER.repeat(locations.get(currentCount)));
                    });
                    System.out.println();
                }
        );
    }

    @Override
    public void printWinners(WinnersResponse winners) {
        final String SEPARATOR = ", ";
        System.out.printf("%s : %s", OutputMessage.FINAL_WINNER.message(),
                winners.winners().stream().map(CarName::name).collect(Collectors.joining(SEPARATOR)));
        System.out.println();
    }
}
