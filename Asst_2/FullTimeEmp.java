package Asst_2;

public class FullTimeEmp extends Employee{
    private double salary, allowance, deductions;
    private String jobTitle;

    public FullTimeEmp(int empID, String name, double salary, double allowance, double deductions, String jobTitle) {
        super(empID, name);
        this.salary = salary;
        this.allowance = allowance;
        this.deductions = deductions;
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void viewData() {
        super.viewData();
        System.out.println("Salary: "+ salary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Deductions: " + deductions);
    }
}
