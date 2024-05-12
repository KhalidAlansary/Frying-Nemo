package entities;

public class Dessert extends MenuItem {
    private int sweetnessLevel;

    public Dessert(String name, int price, int stockQuantity, String description, int sweetnessLevel) {
        super(name, price, stockQuantity, description);
        setSweetnessLevel(sweetnessLevel);
    }
    @Override
    public String toString() {
        return name + " "+getPrice()+"LE";
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
