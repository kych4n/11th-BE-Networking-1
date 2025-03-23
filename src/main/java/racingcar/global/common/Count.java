package racingcar.global.common;

import racingcar.global.exception.TrialCountInvalidException;

public class Count {
    private final int value;

    public Count(String value) {
        this.value = validateValue(value);
    }

    private int validateValue(String value) {
        try {
            int number = Integer.parseInt(value);
            if (number <= 0) {
                throw TrialCountInvalidException.wrong();
            }
            return number;
        } catch (NumberFormatException e) {
            throw TrialCountInvalidException.wrong();
        }
    }

    public int value() {
        return this.value;
    }
}
