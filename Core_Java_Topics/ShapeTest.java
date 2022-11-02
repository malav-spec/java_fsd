package Core_Java_Topics;

abstract class Shape{
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
}

class Rectangle extends Shape{
    private int length, breadth;

    public Rectangle(String name, int length, int breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return this.length * this.breadth;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Rectangle("Rect", 12,10);
        System.out.println(s.calculateArea());
    }
}
