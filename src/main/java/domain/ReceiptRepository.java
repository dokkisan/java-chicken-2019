package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReceiptRepository {
    private static List<Receipt> receipts = new ArrayList<>();

    static {
        TableRepository.tables().forEach(table -> receipts.add(new Receipt(table, false)));
    }

    public static List<Receipt> receipts() {
        return Collections.unmodifiableList(receipts);
    }

    public Receipt findReceiptByTableNumber(int tableNumber) {
        TableRepository tableRepository = new TableRepository();
        Table table = tableRepository.findByTableNumber(tableNumber);
        for (Receipt receipt : receipts()) {
            if (receipt.getTable().getNumber() == table.getNumber()) {
                return receipt;
            }
        }
        return null;
    }

    public void setReceipts(int tableNumber, Menu orderedMenu, int count) {
        for (Table table : TableRepository.tables()) {
            if (tableNumber == table.getNumber()) {
                for (Receipt receipt : receipts()) {
                    if (receipt.getTable().getNumber() == tableNumber) {
                        receipt.addOrderedMenu(orderedMenu, count);
                    }
                }
            }
        }
    }
}
