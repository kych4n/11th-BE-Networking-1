package racingcar.view;

import racingcar.dto.request.ParticipantsRequest;
import racingcar.dto.request.TrialCountRequest;

public interface InputView {
    ParticipantsRequest readParticipants();

    TrialCountRequest readTrialCount();
}
