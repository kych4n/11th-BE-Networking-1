package racingcar.view.console;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import racingcar.dto.request.ParticipantsRequest;
import racingcar.dto.request.TrialCountRequest;
import racingcar.global.exception.CarNamesDuplicatedException;
import racingcar.global.message.InputMessage;
import racingcar.view.InputView;

public class ConsoleInputView implements InputView {
    @Override
    public ParticipantsRequest readParticipants() {
        final String SEPARATOR = ",";
        System.out.println(InputMessage.PARTICIPANTS.message());
        List<String> carNames = Arrays.stream(Console.readLine().split(SEPARATOR)).toList();
        validateDuplicated(carNames);
        return ParticipantsRequest.of(carNames);
    }

    @Override
    public TrialCountRequest readTrialCount() {
        System.out.println(InputMessage.TRIAL_COUNT.message());
        return TrialCountRequest.of(Console.readLine());
    }

    private void validateDuplicated(List<String> carNames) {
        if (carNames.size() != new HashSet<>(carNames).size()) {
            throw CarNamesDuplicatedException.wrong();
        }
    }
}
