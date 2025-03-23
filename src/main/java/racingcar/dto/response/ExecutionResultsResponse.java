package racingcar.dto.response;

import java.util.List;
import java.util.Map;
import racingcar.domain.car.CarName;

public record ExecutionResultsResponse(
        Map<CarName, List<Integer>> executionResults
) {
    public static ExecutionResultsResponse of(Map<CarName, List<Integer>> executionResults) {
        return new ExecutionResultsResponse(executionResults);
    }
}