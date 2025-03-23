package racingcar.domain.car;

public enum ForwardConstraint {
    RANDOM_LOWER_BOUND(0),
    RANDOM_UPPER_BOUND(9),
    FORWARD_THRESHOLD(4);

    private final int value;

    ForwardConstraint(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
