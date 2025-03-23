package racingcar.application;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;
import racingcar.dto.request.ParticipantsRequest;
import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;
import racingcar.dto.response.WinnersResponse;
import racingcar.persistence.CarMemoryRepository;
import racingcar.persistence.CarRepository;

public class RacingGameService {
    private final CarRepository carRepository = new CarMemoryRepository();

    public void register(ParticipantsRequest participants) {
        participants.toEntity().forEach(carRepository::save);
    }

    public ExecutionResultsResponse race(TrialCountRequest trialCount) {
        List<Car> cars = carRepository.findAll();
        Map<CarName, List<Integer>> executionResults = cars.stream()
                .collect(Collectors.toMap(Car::name, car -> new LinkedList<>(), (oldValue, newValue) -> newValue,
                        LinkedHashMap::new));
        IntStream.range(0, trialCount.toEntity().value()).forEach(currentCount ->
                cars.forEach(car -> {
                    car.tryForward();
                    executionResults.get(car.name()).add(car.location().value());
                })
        );
        return ExecutionResultsResponse.of(executionResults);
    }

    public WinnersResponse determineWinners() {
        List<Car> cars = carRepository.findAll();
        int maxLocation = cars.stream().mapToInt(car -> car.location().value()).max().getAsInt();
        return WinnersResponse.of(cars.stream().filter(car -> car.location().value() == maxLocation).toList());
    }
}
