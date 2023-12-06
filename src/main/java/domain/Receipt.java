package domain;

public class Receipt {
    private final Table table;
    private boolean isOrdered;

    public Receipt(Table table, boolean isOrdered) {
        this.table = table;
        this.isOrdered = isOrdered;
    }

    public Table getTable() {
        return table;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }
}
