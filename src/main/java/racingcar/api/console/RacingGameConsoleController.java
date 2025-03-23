package racingcar.api.console;

import racingcar.api.RacingGameController;
import racingcar.application.RacingGameService;
import racingcar.dto.request.ParticipantsRequest;
import racingcar.dto.request.TrialCountRequest;
import racingcar.dto.response.ExecutionResultsResponse;
import racingcar.dto.response.WinnersResponse;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.console.ConsoleInputView;
import racingcar.view.console.ConsoleOutputView;

public class RacingGameConsoleController implements RacingGameController {
    private final InputView inputView = new ConsoleInputView();
    private final OutputView outputView = new ConsoleOutputView();
    private final RacingGameService racingGameService = new RacingGameService();

    @Override
    public void start() {
        ParticipantsRequest participants = inputView.readParticipants();
        racingGameService.register(participants);
        TrialCountRequest trialCount = inputView.readTrialCount();
        ExecutionResultsResponse executionResults = racingGameService.race(trialCount);
        outputView.printExecutionResults(executionResults, trialCount);
        WinnersResponse winnersResponse = racingGameService.determineWinners();
        outputView.printWinners(winnersResponse);
    }
}
