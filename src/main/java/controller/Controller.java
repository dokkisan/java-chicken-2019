package controller;

import message.Operation;
import view.InputView;
import view.OutputView;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String selectFeature = getSelectedFeature();
        System.out.println(selectFeature);
    }

    private String getSelectedFeature() {
        while (true) {
            try {
                outputView.printFeaturesOfPos();
                outputView.printBlankLine();
                outputView.printOneLineMessage(Operation.PROMPT_SELECT_FEATURE.getMessage());
                return inputView.inputSelectFeature();
            } catch (IllegalArgumentException e) {
                outputView.printOneLineMessage(e.getMessage());
            }
        }
    }
}
