package racingcar.global.exception;

import racingcar.global.message.ErrorMessage;

public class CarNameLengthExceededException extends RuntimeException {
    public CarNameLengthExceededException(ErrorMessage errorMessage) {
        super(errorMessage.message());
    }

    public static CarNameLengthExceededException wrong() {
        return new CarNameLengthExceededException(ErrorMessage.CAR_NAME_LENGTH_EXCEEDED);
    }
}
