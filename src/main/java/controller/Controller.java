package controller;

import domain.ReceiptRepository;
import message.Operation;
import view.InputView;
import view.OutputView;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        while (true) {
            String selectedFeature = getSelectedFeature();

            // 프로그램 종료
            if (selectedFeature.matches("3")) {
                return;
            }

            String selectedTable = getSelectTable();

            String orderMenu = "";
            String countOfOrderedMenu = "";
            if (selectedFeature.equals("1")) {
                orderMenu = getOrderMenu();
                countOfOrderedMenu = getCountOfOrderedMenu();
            }
            System.out.println(orderMenu);
            System.out.println(countOfOrderedMenu);

            // 테이블, 영수증 생성
//            TableRepository.tables().get(Integer.parseInt(selectedTable));
            ReceiptRepository.receipts().get(Integer.parseInt(selectedTable) - 1).setOrdered(true);
        }
    }

    private String getSelectedFeature() {
        while (true) {
            try {
                outputView.printFeaturesOfPos();
                outputView.printBlankLine();
                outputView.printOneLineMessage(Operation.PROMPT_SELECT_FEATURE.getMessage());
                return inputView.inputSelectFeature();
            } catch (IllegalArgumentException e) {
                outputView.printOneLineMessage(e.getMessage());
            }
        }
    }

    private String getSelectTable() {
        while (true) {
            try {
                outputView.printOneLineMessage(Operation.PROMPT_SELECT_TABLE.getMessage());
                outputView.printTables();
                return inputView.inputSelectTableNumber();
            } catch (IllegalArgumentException e) {
                outputView.printOneLineMessage(e.getMessage());
            }
        }
    }

    private String getOrderMenu() {
        while (true) {
            try {
                outputView.printMenus();
                outputView.printOneLineMessage(Operation.PROMPT_ORDER_MENU.getMessage());
                return inputView.inputOrderMenuNumber();
            } catch (IllegalArgumentException e) {
                outputView.printOneLineMessage(e.getMessage());
            }
        }
    }

    private String getCountOfOrderedMenu() {
        while (true) {
            try {
                outputView.printOneLineMessage(Operation.PROMPT_COUNT_OF_ORDERED_MENU.getMessage());
                return inputView.inputCountOfOrderedMenu();
            } catch (IllegalArgumentException e) {
                outputView.printOneLineMessage(e.getMessage());
            }
        }
    }
}
