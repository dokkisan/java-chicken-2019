package view;

import camp.nextstep.edu.missionutils.Console;
import validator.Validator;

public class InputView {
    private final Validator validator;

    public InputView() {
        validator = new Validator();
    }

    public String inputSelectFeature() {
        return validator.validateInputFeature(Console.readLine());
    }

    public String inputSelectTableNumber() {
        return validator.validateInputTableNumber(Console.readLine());
    }
}