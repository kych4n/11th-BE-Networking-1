package racingcar.global.message;

public enum OutputMessage {
    EXECUTION_RESULT("실행 결과");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
