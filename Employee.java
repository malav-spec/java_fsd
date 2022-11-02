public class Employee {
    private int empID;
    private String name;
    private String empAddr;

    public int hashCode(){
        return 1020;
    }

    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        if(this.empID == e.empID && this.empAddr.equals(e.empAddr) && this.name.equals(e.name)){
            return true;
        }

        return false;
    }

    public Employee(int empID, String name, String empAddr) {
        this.empID = empID;
        this.name = name;
        this.empAddr = empAddr;
    }

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

    public String getEmpAddr() {
        return empAddr;
    }

    public void setEmpAddr(String empAddr) {
        this.empAddr = empAddr;
    }
}
