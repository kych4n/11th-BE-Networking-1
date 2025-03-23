package racingcar.view;

import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;

public interface OutputView {
    void printExecutionResults(ExecutionResultsResponse executionResults, TrialCountRequest trialCount);
}
