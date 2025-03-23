package racingcar.domain.car;

import racingcar.global.exception.CarNameLengthExceededException;

public class CarName {
    public static final int NAME_MAX_LENGTH = 5;
    private final String name;

    public CarName(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.length() > NAME_MAX_LENGTH) {
            throw CarNameLengthExceededException.wrong();
        }
    }

    public String name() {
        return this.name;
    }
}
