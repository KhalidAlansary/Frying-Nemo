public class StaffMember extends Person {
    int salary;
    Job job;

    public StaffMember(String email, String firstName, String lastName, Job job, int salary) {
        super(email, firstName, lastName);
        this.job = job;
        this.salary = salary;
    }

    public StaffMember(String email, Job job, int salary) {
        this(email, null, null, job, salary);
    }

    public StaffMember(String email, String firstName, String lastName, Job job) {
        this(email, firstName, lastName, job, 0);
    }

    public StaffMember(String email, Job job) {
        this(email, null, null, job, 0);
    }
}
