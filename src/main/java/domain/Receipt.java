package domain;

import java.util.HashMap;
import java.util.Map;

public class Receipt {
    private final Table table;
    private boolean isOrdered;
    private Map<Menu, Integer> orderedMenus = new HashMap<>();

    public Receipt(Table table, boolean isOrdered) {
        this.table = table;
        this.isOrdered = isOrdered;
    }

    public Table getTable() {
        return table;
    }

    public Map<Menu, Integer> getOrderedMenus() {
        return orderedMenus;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public void addOrderedMenu(Menu menu, int count) {
        orderedMenus.put(menu, count);
    }
}
