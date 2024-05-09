package entities;

import java.util.ArrayList;

public class Restaurant {

    private int noOfStaff;
    public static ArrayList<StaffMember> staffMembers = new ArrayList<StaffMember>();
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static ArrayList<Table> tables = new ArrayList<Table>();
    public static ArrayList<MainDish> mainDishes = new ArrayList<MainDish>();
    public static ArrayList<Dessert> desserts = new ArrayList<Dessert>();

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }
}
