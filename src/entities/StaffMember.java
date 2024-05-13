package entities;

public class StaffMember extends Person {
    private int salary;
    public Job job;

    public StaffMember(String email, String firstName, String lastName, Job job, int salary) {
        super(email, firstName, lastName);
        this.job = job;
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }
}
