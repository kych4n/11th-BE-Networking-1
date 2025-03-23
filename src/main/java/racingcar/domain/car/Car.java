package racingcar.domain.car;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final CarName name;
    private final Location location;
    private final Speed speed;

    public Car(CarName name) {
        this.name = name;
        this.location = new Location();
        this.speed = new Speed();
    }

    public CarName name() {
        return this.name;
    }

    public Location location() {
        return this.location;
    }

    public Speed speed() {
        return this.speed;
    }

    public void tryForward() {
        if (Randoms.pickNumberInRange(
                ForwardConstraint.RANDOM_LOWER_BOUND.value(),
                ForwardConstraint.RANDOM_UPPER_BOUND.value()
        ) >= ForwardConstraint.FORWARD_THRESHOLD.value()) {
            this.location.increase(this.speed.value());
        }
    }
}
