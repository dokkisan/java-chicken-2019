package validator;

import message.ErrorMessage;

public class Validator {

    public String validateInputFeature(String inputFeature) {
        if (!inputFeature.matches("[1-3]")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_VALID_FEATURE_NUMBER.getMessage());
        }

        return inputFeature;
    }

    public String validateInputTableNumber(String inputTableNumber) {
        if (!inputTableNumber.matches("[1-8]")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_VALID_TABLE_NUMBER.getMessage());
        }
        // TODO: 글자수 확인
        return inputTableNumber;
    }

    public String validateInputMenuNumber(String inputMenuNumber) {
        if (!inputMenuNumber.matches("[1-6]|21|22")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_VALID_MENU_NUMBER.getMessage());
        }
        return inputMenuNumber;
    }
}
