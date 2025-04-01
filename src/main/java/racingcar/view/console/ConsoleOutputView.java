package racingcar.view.console;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.domain.car.CarName;
import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;
import racingcar.dto.response.WinnersResponse;
import racingcar.global.message.OutputMessage;
import racingcar.view.OutputView;
import racingcar.view.ViewConstant;

public class ConsoleOutputView implements OutputView {
    @Override
    public void printExecutionResults(ExecutionResultsResponse executionResults, TrialCountRequest trialCount) {
        System.out.println(OutputMessage.EXECUTION_RESULT.message());
        IntStream.range(0, trialCount.toEntity().value()).forEach(currentCount -> {
                    executionResults.executionResults().forEach((carName, locations) -> {
                        System.out.printf(ViewConstant.COLON_SEPARATED_FORMAT.value(), carName.name(),
                                ViewConstant.LOCATION_MARKER.value().repeat(locations.get(currentCount)));
                    });
                    System.out.println();
                }
        );
    }

    @Override
    public void printWinners(WinnersResponse winners) {
        System.out.printf(ViewConstant.COLON_SEPARATED_FORMAT.value(), OutputMessage.FINAL_WINNER.message(),
                winners.winners().stream().map(CarName::name)
                        .collect(Collectors.joining(ViewConstant.WINNERS_SEPARATOR.value())));
    }
}
