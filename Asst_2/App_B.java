package Asst_2;

public class App_B {
    public static void main(String[] args) {
        Employee e;
        e = new FullTimeEmp(1, "Malav", 50000, 1200, 100, "SDE");
        e.viewData();

        System.out.println();

        e = new PartTimeEmp(2, "Dan", "SDe-3", 500, 9);
        e.viewData();
    }
}
