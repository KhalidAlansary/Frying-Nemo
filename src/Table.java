public class Table {
private static int noOfTablesInUse;
private static int freeTables;
private int  tableNo;
private int capacity;
private boolean reserved;

String email;
String firstName;
String lastName;

Customer reservingCustomer = new Customer(email,firstName,lastName);

void setNoOfTables (int noOfTables){
    boolean positiveNo = true;
    while(positiveNo){
        if (noOfTables >= 0) {
            this.noOfTablesInUse = noOfTables;
            positiveNo = false;
        }
        else{
            throw new IllegalArgumentException("not a valid No.");
        }

    }
}




}