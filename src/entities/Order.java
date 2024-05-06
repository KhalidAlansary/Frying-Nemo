package entities;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    public Order(int size) {
        items = new ArrayList<>(size);

    }

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public int checkTotal() {
        int total = 0;
        for (MenuItem item : items) {

            total += item.getPrice();
        }
        return total;
    }
}
