public abstract class MenuItem {
    public String name;
    public String description;
    public int price;
    private int stockQuantity;

    public MenuItem(String name, int price, Integer stockQuantity, String description) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public MenuItem(String name, int price, String description) {
        this(name, price, null, description);
    }

    public MenuItem(String name, int price, Integer stockQuantity) {
        this(name, price, stockQuantity, null);
    }

    public MenuItem(String name, int price) {
        this(name, price, null, null);
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative");
        }
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }
}
