package validator;

import message.ErrorMessage;

import java.util.Formatter;

public class Validator {

    public String validateInputFeature(String inputFeature) {
        // TODO
        if (!inputFeature.matches("[1-3]")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_VALID_FEATURE_NUMBER.getMessage());
        }
        return inputFeature;
    }

    public String validateInputTableNumber(String inputTableNumber) {
        // TODO
        return inputTableNumber;
    }
}
