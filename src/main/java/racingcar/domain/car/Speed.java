package racingcar.domain.car;

public class Speed {
    private static final int DEFAULT_VALUE = 1;
    private final int value;

    public Speed() {
        this.value = DEFAULT_VALUE;
    }

    public int value() {
        return this.value;
    }
}
