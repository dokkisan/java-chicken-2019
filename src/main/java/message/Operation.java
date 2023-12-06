package message;

public enum Operation {
    PROMPT_SELECT_FEATURE("## 원하는 기능을 선택하세요."),
    PROMPT_SELECT_TABLE("## 테이블을 선택하세요."),
    PROMPT_ORDER_MENU("## 등록할 메뉴를 선택하세요."),
    PROMPT_COUNT_OF_ORDERED_MENU("## 등록할 메뉴를 선택하세요."),
    ;

    private final String message;

    Operation(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
