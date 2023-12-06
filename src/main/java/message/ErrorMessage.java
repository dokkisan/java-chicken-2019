package message;

public enum ErrorMessage {
    INPUT_VALID_FEATURE_NUMBER("유효한 기능 번호을 입력해주세요."),
    INPUT_VALID_TABLE_NUMBER("유효한 테이블 번호를 입력해주세요.")
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
