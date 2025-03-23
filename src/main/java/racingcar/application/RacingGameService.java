package racingcar.application;

import racingcar.dto.request.ParticipantsRequest;
import racingcar.persistence.CarMemoryRepository;
import racingcar.persistence.CarRepository;

public class RacingGameService {
    private final CarRepository carRepository = new CarMemoryRepository();

    public void register(ParticipantsRequest participants) {
        participants.toEntity().forEach(carRepository::save);
    }
}
