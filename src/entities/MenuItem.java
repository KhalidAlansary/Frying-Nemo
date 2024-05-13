package entities;

public abstract class MenuItem {
    public String name;
    public String description;
    private int price;
    private int stockQuantity;

    public MenuItem(String name, int price, int stockQuantity, String description) {
        this.name = name;
        setPrice(price);
        setStockQuantity(stockQuantity);
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative");
        }
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }
}
