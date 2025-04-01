package racingcar.view;

public enum ViewConstant {
    PARTICIPANTS_SEPARATOR(","),

    LOCATION_MARKER("-"),
    WINNERS_SEPARATOR(", "),
    COLON_SEPARATED_FORMAT("%s : %s\n");

    private final String value;

    ViewConstant(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
