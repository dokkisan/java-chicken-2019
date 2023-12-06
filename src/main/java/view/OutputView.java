package view;

public class OutputView {

    public void printOneLineMessage(String message) {
        System.out.println(message);
    }

    public void printFeaturesOfPos() {
        final String features = "## 메인화면\n" +
                "1 - 주문등록\n" +
                "2 - 결제하기\n" +
                "3 - 프로그램 종료";

        System.out.println(features);
    }

    public void printBlankLine() {
        System.out.println();
    }

    public void printTables() {
        // TODO
    }

    public void printMenus() {
        // TODO
    }

    public void printOrderdMenus() {
        // TODO
        // ## 주문 내역
        // 메뉴 수량 금액
        // 후라이드 1 16000
        // 콜라 1 1000
    }
}
