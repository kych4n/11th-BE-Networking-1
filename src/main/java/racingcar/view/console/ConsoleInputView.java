package racingcar.view.console;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import racingcar.dto.request.ParticipantsRequest;
import racingcar.global.message.InputMessage;
import racingcar.view.InputView;

public class ConsoleInputView implements InputView {
    @Override
    public ParticipantsRequest readParticipants() {
        final String SEPARATOR = ",";
        System.out.println(InputMessage.PARTICIPANTS.message());
        return ParticipantsRequest.of(Arrays.stream(Console.readLine().split(SEPARATOR)).toList());
    }
}
