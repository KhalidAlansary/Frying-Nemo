package entities;

public class MainDish extends MenuItem {
    private int spicinessLevel;

    public MainDish(String name, int price, int stockQuantity, String description, int spicinessLevel) {
        super(name, price, stockQuantity, description);
        setSpicinessLevel(spicinessLevel);
    }

    @Override
    public String toString() {
        return name + " " + getPrice() + "LE";
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
