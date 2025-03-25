package racingcar.persistence;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;

public class CarMemoryRepository implements CarRepository {
    private static final List<Car> cars = new ArrayList<>();

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }
}
