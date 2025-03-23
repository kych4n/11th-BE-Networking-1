package racingcar.dto.request;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;

public record ParticipantsRequest(
        List<CarName> participants
) {
    public static ParticipantsRequest of(List<String> participants) {
        return new ParticipantsRequest(participants.stream().map(CarName::new).toList());
    }

    public List<Car> toEntity() {
        return participants().stream().map(Car::new).toList();
    }
}
