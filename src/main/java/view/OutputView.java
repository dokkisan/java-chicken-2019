package view;

import domain.Menu;
import domain.Receipt;
import domain.ReceiptRepository;

import java.util.Map;

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
        final String topOfTable = "┏ - ┓";
        final String middleOfTable = "| %d |";
        final String bottomOfTable = "┗ %s ┛";

        for (int i = 0; i < ReceiptRepository.receipts().size(); i++) {
            System.out.print(topOfTable);
        }
        System.out.print("\n");

        for (Receipt receipt : ReceiptRepository.receipts()) {
            int tableNumber = receipt.getTable().getNumber();
            System.out.printf(middleOfTable, tableNumber);
        }
        System.out.print("\n");

        for (Receipt receipt : ReceiptRepository.receipts()) {
            boolean isOrdered = receipt.isOrdered();
            if (isOrdered) {
                System.out.printf(bottomOfTable, "#");
            } else {
                System.out.printf(bottomOfTable, "-");
            }
        }

        System.out.print("\n");

        printBlankLine();
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

    public void printOrderedMenus(int tableNumber) {
        ReceiptRepository receiptRepository = new ReceiptRepository();
        Receipt receipt = receiptRepository.findReceiptByTableNumber(tableNumber);
        System.out.println("## 주문 내역");
        System.out.println("메뉴 수량 금액");
        Map<Menu, Integer> menus = receipt.getOrderedMenus();
        for (Map.Entry<Menu, Integer> orderedMenusAndCount : menus.entrySet()) {
            System.out.println(orderedMenusAndCount.getKey().getName() + " " + orderedMenusAndCount.getValue() + " " + orderedMenusAndCount.getKey().getPrice());
        }
    }
}
