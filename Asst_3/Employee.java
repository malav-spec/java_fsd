package Asst_3;

public class Employee {
    private int empID;
    private String name;

    private String job;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Employee(int empID, String name, String job) {
        this.empID = empID;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
