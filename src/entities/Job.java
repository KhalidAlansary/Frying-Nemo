package entities;

public enum Job {
    CHEF("Chef"),
    CHEF_ASSISTANT("Chef Assistant"),
    WAITER("Waiter"),
    MANAGER("Manager");

    public String jobName;

    Job(String job) {
        this.jobName = job;
    }

    @Override
    public String toString() {
        return jobName;
    }
}
