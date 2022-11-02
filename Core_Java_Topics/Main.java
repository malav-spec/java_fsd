package Core_Java_Topics;

class Car{
    private String brand;

    public Car() {
        this.brand = "Ford";
    }

    public String getBrand(){
        return this.brand;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new Car().getBrand());
    }
}
