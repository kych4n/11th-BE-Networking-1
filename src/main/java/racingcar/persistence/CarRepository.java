package racingcar.persistence;

import java.util.List;
import racingcar.domain.car.Car;

public interface CarRepository {
    void save(Car car);

    List<Car> findAll();
}
