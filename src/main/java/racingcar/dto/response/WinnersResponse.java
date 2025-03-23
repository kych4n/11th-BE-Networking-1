package racingcar.dto.response;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;

public record WinnersResponse(
        List<CarName> winners
) {
    public static WinnersResponse of(List<Car> winners) {
        return new WinnersResponse(winners.stream().map(Car::name).toList());
    }
}
