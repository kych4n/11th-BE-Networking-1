package racingcar;

import racingcar.api.RacingGameController;
import racingcar.api.console.RacingGameConsoleController;

public class Application {
    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameConsoleController();
        racingGameController.start();
    }
}
