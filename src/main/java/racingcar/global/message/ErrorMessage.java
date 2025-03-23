package racingcar.global.message;

import racingcar.domain.car.CarName;

public enum ErrorMessage {
    CAR_NAME_LENGTH_EXCEEDED(String.format("자동차 이름은 %d자 이하이어야 합니다.", CarName.NAME_MAX_LENGTH));

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
