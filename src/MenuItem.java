public abstract class MenuItem {
    public String name;
    public String description;
    private int price;
    private int stockQuantity;

    public MenuItem(String name, int price, int stockQuantity, String description) {
        this.name = name;
        setPrice(price);
        this.stockQuantity = stockQuantity;
        this.description = description;
    }

    public MenuItem(String name, int price, String description) {
        this(name, price, 0, description);
    }

    public MenuItem(String name, int price, int stockQuantity) {
        this(name, price, stockQuantity, null);
    }

    public MenuItem(String name, int price) {
        this(name, price, 0, null);
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
        return stockQuantity;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }
}