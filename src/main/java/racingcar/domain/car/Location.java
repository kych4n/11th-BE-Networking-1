package racingcar.domain.car;

public class Location {
    private static final int DEFAULT_VALUE = 0;
    private int value;

    public Location() {
        this.value = DEFAULT_VALUE;
    }

    public void increase(int speed) {
        this.value += speed;
    }

    public int value() {
        return this.value;
    }
}
