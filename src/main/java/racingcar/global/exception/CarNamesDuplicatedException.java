package racingcar.global.exception;

import racingcar.global.message.ErrorMessage;

public class CarNamesDuplicatedException extends IllegalArgumentException {
    public CarNamesDuplicatedException(ErrorMessage errorMessage) {
        super(errorMessage.message());
    }

    public static CarNamesDuplicatedException wrong() {
        return new CarNamesDuplicatedException(ErrorMessage.CAR_NAMES_DUPLICATED);
    }
}
