package entities;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private Customer customer;


    public Order(Customer custumer) {
        items = new ArrayList<>();
        this.customer=custumer;
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
