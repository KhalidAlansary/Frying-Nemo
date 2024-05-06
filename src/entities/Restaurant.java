package entities;

import java.util.ArrayList;

public class Restaurant {
    private int noOfTables;
    private int noOfStaff;
    public static ArrayList<StaffMember> staffMembers = new ArrayList<StaffMember>();
    public static ArrayList<MainDish> mainDishes = new ArrayList<MainDish>();
    public static ArrayList<Dessert> desserts = new ArrayList<Dessert>();

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public int getNoOfTables() {
        return noOfTables;
    }
}
