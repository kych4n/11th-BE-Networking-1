package racingcar.global.message;

import racingcar.domain.car.CarName;

public enum ErrorMessage {
    CAR_NAME_LENGTH_EXCEEDED(String.format("자동차 이름은 %d자 이하이어야 합니다.", CarName.NAME_MAX_LENGTH)),
    CAR_NAMES_DUPLICATED("중복된 자동차 이름이 있습니다."),
    
    TRIAL_COUNT_INVALID("시도 횟수는 자연수이어야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
