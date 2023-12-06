package message;

public enum ErrorMessage {
    INPUT_VALID_FEATURE_NUMBER("유효한 기능 번호을 입력해주세요."),
    INPUT_VALID_TABLE_NUMBER("유효한 테이블 번호를 입력해주세요."),
    INPUT_VALID_MENU_NUMBER("유효한 메뉴 번호를 입력해주세요."),
    INPUT_VALID_COUNT_OF_ORDERED_MENU("한 메뉴의 최대 주문 가능한 수량은 99개 입니다.")
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        final String prefix = "[ERROR] ";
        return prefix + message;
    }
}
