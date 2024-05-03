import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    public Order(int size) {
        items = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            items.add(null);
        }
    }

    public void addItem(MenuItem item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == null) {
                items.set(i, item);
                return;
            }
        }
        System.out.println("Order is full. Cannot add more items.");
    }
    public double checkTotal() {
        double total = 0;
        for (MenuItem item : items) {
            if (item != null) {
                total += item.getPrice();
            }
        }
        return total;
    }
}
