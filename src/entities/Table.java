package entities;

import javafx.scene.control.Tab;

public class Table {

    private int capacity;
    private final int tableNo;
    private static int noOfTables=0;
    private static int noOfTablesInUse;
    private static int freeTables;
    private boolean reserved;

    public Table(int capacity){
        this.capacity=capacity;
        this.tableNo=noOfTables+1;
        noOfTables++;
    }



}