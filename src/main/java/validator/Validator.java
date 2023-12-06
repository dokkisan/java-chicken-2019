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

    public String validateInputMenuNumber(String inputMenuNumber) {
        if (!inputMenuNumber.matches("[1-6]|21|22")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_VALID_MENU_NUMBER.getMessage());
        }
        return inputMenuNumber;
    }

    public String validateInputCountOfOrderedMenu(String inputCount) {
        // TODO: 재주문시에도 한 메뉴의 총 주문수량이 99개 이하인지 유효성 검사 필요!!
        if (!inputCount.matches("[1-9]|[1-9][0-9]")) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_VALID_COUNT_OF_ORDERED_MENU.getMessage());
        }
        return inputCount;
    }
}
