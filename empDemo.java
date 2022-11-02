public class empDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "malav", "nj");
        Employee e2 = new Employee(1, "malav", "nj");

        System.out.println(e1.equals(e2));
    }
}
