package entities;

import java.io.File;

public class Dessert extends MenuItem {
    private int sweetnessLevel;

    public Dessert(String name, int price, int stockQuantity, String description, int sweetnessLevel, File image) {
        super(name, price, stockQuantity, description, image);
        setSweetnessLevel(sweetnessLevel);
    }

    public Dessert(String name, int price, String description, int sweetnessLevel) {
        this(name, price, 0, description, sweetnessLevel, null);
    }

    public Dessert(String name, int price, int stockQuantity, int sweetnessLevel) {
        this(name, price, stockQuantity, null, sweetnessLevel, null);
    }

    public Dessert(String name, int price, int sweetnessLevel) {
        this(name, price, 0, null, sweetnessLevel, null);
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
