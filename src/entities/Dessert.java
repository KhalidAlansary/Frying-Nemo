package entities;

public class Dessert extends MenuItem {
    private int sweetnessLevel;

    public Dessert(String name, int price, Integer stockQuantity, String description, int sweetnessLevel) {
        super(name, price, stockQuantity, description);
        setSweetnessLevel(sweetnessLevel);
    }

    public Dessert(String name, int price, String description, int sweetnessLevel) {
        this(name, price, 0, description, sweetnessLevel);
    }

    public Dessert(String name, int price, int stockQuantity, int sweetnessLevel) {
        this(name, price, stockQuantity, null, sweetnessLevel);
    }

    public Dessert(String name, int price, int sweetnessLevel) {
        this(name, price, 0, null, sweetnessLevel);
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        if (sweetnessLevel < 0 || sweetnessLevel > 3) {
            throw new IllegalArgumentException("Sweetness level must be between zero and three (inclusive)");
        }
        this.sweetnessLevel = sweetnessLevel;
    }
}
