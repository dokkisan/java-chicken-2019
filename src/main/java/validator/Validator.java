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

        return inputTableNumber;
    }
}
