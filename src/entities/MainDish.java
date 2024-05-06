package entities;

import java.io.File;

public class MainDish extends MenuItem {
    private int spicinessLevel;

    public MainDish(String name, int price, int stockQuantity, String description, int spicinessLevel, File image) {
        super(name, price, stockQuantity, description, image);
        setSpicinessLevel(spicinessLevel);
    }

    public int getSpicinessLevel() {
        return spicinessLevel;
    }

    public void setSpicinessLevel(int spicinessLevel) {
        if (spicinessLevel < 0 || spicinessLevel > 3) {
            throw new IllegalArgumentException("Spiciness level must be between zero and three (inclusive)");
        }
        this.spicinessLevel = spicinessLevel;
    }
}
