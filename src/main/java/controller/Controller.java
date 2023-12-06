package controller;

import domain.MenuRepository;
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

            String selectedTable = "";
            if (selectedFeature.equals("1")) {
                selectedTable = getSelectTable();
                String inputOrderMenu = getOrderMenu();
                String countOfOrderedMenu = getCountOfOrderedMenu();

                ReceiptRepository receiptRepository = new ReceiptRepository();
                MenuRepository menuRepository = new MenuRepository();
                receiptRepository.setReceipts(Integer.parseInt(selectedTable),
                        menuRepository.findByNumber(Integer.parseInt(inputOrderMenu)),
                        Integer.parseInt(countOfOrderedMenu));
                receiptRepository.findReceiptByTableNumber(Integer.parseInt(selectedTable)).setOrdered(true);
            }


            if (selectedFeature.equals("2")) {
                int tableNumber = Integer.parseInt(getSelectTable());
                outputView.printOrderedMenus(tableNumber);
                int paymentMethod = Integer.parseInt(getPaymentMethod(tableNumber));

                // 최종 결제 금액 계산
                //
            }
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

    private String getPaymentMethod(int tableNumber) {
        while (true) {
            try {
                outputView.printOneLineMessage("## " + tableNumber + "번 테이블의 결제를 진행합니다.");
                outputView.printOneLineMessage(Operation.PROMPT_PAYMENT_METHOD.getMessage());
                return inputView.inputPaymentMethod();
            } catch (IllegalArgumentException e) {
                outputView.printOneLineMessage(e.getMessage());
            }
        }
    }
}
