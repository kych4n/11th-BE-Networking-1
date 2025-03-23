package racingcar.dto.request;

import racingcar.global.common.Count;

public record TrialCountRequest(
        Count trialCount
) {
    public static TrialCountRequest of(String trialCount) {
        return new TrialCountRequest(new Count(trialCount));
    }

    public Count toEntity() {
        return trialCount();
    }
}
