package racingcar.global.message;

public enum OutputMessage {
    EXECUTION_RESULT("실행 결과"),
    FINAL_WINNER("최종 우승자");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
