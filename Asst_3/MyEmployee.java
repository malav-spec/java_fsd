package Asst_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyEmployee implements ProcessInfo{
    private static Map<Integer, Employee> employees= new HashMap<>();
    @Override
    public void registerEmp(Employee emp) {
        employees.put(emp.getEmpID(), emp);
    }

    @Override
    public void viewEmp(int empID) {
        System.out.println(employees.get(empID).toString());
    }


    public static void main(String[] args) {
        Employee emp = new Employee(1, "Malav", "SDE");

        MyEmployee myEmployee = new MyEmployee();
        myEmployee.registerEmp(emp);
        myEmployee.viewEmp(1);
    }

}
