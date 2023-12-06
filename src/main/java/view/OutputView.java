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
        final String availableMenus =
                "[치킨] 1 - 후라이드 : 16000원\n" +
                "[치킨] 2 - 양념치킨 : 16000원\n" +
                "[치킨] 3 - 반반치킨 : 16000원\n" +
                "[치킨] 4 - 통구이 : 16000원\n" +
                "[치킨] 5 - 간장치킨 : 17000원\n" +
                "[치킨] 6 - 순살치킨 : 17000원\n" +
                "[음료] 21 - 콜라 : 1000원\n" +
                "[음료] 22 - 사이다 : 1000원";

        System.out.println(availableMenus);
        printBlankLine();
    }

    public void printOrderedMenus() {
        // TODO
        // ## 주문 내역
        // 메뉴 수량 금액
        // 후라이드 1 16000
        // 콜라 1 1000
    }
}
