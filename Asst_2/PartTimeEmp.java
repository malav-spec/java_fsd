package Asst_2;

public class PartTimeEmp extends Employee{
    private String jobTitle;
    private double payPerDay;
    private double workDuration;

    public PartTimeEmp(int empID, String name, String jobTitle, double payPerDay, double workDuration) {
        super(empID, name);
        this.jobTitle = jobTitle;
        this.payPerDay = payPerDay;
        this.workDuration = workDuration;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getPayPerDay() {
        return payPerDay;
    }

    public void setPayPerDay(double payPerDay) {
        this.payPerDay = payPerDay;
    }

    public double getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(double workDuration) {
        this.workDuration = workDuration;
    }

    @Override
    public void viewData() {
        super.viewData();
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Pay per day: " + payPerDay);
        System.out.println("Work duration: " + workDuration);
    }
}
