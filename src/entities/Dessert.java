package entities;

import java.io.File;

public class Dessert extends MenuItem {
    private int sweetnessLevel;

    public Dessert(String name, int price, int stockQuantity, String description, int sweetnessLevel, File image) {
        super(name, price, stockQuantity, description, image);
        setSweetnessLevel(sweetnessLevel);
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
