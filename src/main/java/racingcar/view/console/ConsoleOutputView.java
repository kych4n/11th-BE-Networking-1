package racingcar.view.console;

import java.util.stream.IntStream;
import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;
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
}
