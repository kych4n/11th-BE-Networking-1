package racingcar.view;

import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;
import racingcar.dto.response.WinnersResponse;

public interface OutputView {
    void printExecutionResults(ExecutionResultsResponse executionResults, TrialCountRequest trialCount);

    void printWinners(WinnersResponse winners);
}
