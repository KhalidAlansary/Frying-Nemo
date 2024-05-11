package entities;

public class Table {

    private int capacity;
    private final int tableNo;
    private static int noOfTables=0;
    private boolean reserved = false;
    public Customer reservingCustomer;

    public Table(int capacity){
        this.capacity=capacity;
        this.tableNo=noOfTables+1;
        noOfTables++;
    }

    public boolean getavailability(){
        return reserved;
    }

    public void freeATable(){
       reserved = false;
    }
    public void reserveATable(){
        reserved = true;
    }



    @Override
    public String toString() {
        return("tableNo: "+tableNo+", Capacity: " + capacity) ;
    }




}