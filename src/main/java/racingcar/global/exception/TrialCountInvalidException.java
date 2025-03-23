package racingcar.global.exception;

import racingcar.global.message.ErrorMessage;

public class TrialCountInvalidException extends IllegalArgumentException {
    public TrialCountInvalidException(ErrorMessage errorMessage) {
        super(errorMessage.message());
    }

    public static TrialCountInvalidException wrong() {
        return new TrialCountInvalidException(ErrorMessage.TRIAL_COUNT_INVALID);
    }
}
