package entities;

import java.util.ArrayList;

public class Restaurant {
    private int noOfTables;
    private int noOfStaff;
    public static ArrayList<StaffMember> staffMembers = new ArrayList<StaffMember>();

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
