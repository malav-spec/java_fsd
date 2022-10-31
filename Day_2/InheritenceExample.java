package Day_2;

class Cycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class Bike extends Cycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    Bike(){
        System.out.println("Hello I am a Bike I am "+ define_me());
        String temp=super.define_me();
        System.out.println("My ancestor is a cycle who is "+  temp);
    }

}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("I am eating");
    }

    void bark(){
        System.out.println("I am barking");
    }
}

class InheritenceExample{
    public static void main(String []args){
//        Bike M=new Bike();
        Dog dog = new Dog();
        dog.walk();
        dog.eat();
        dog.bark();
    }
}

