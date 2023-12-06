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
}
