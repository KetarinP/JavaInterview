package OOP_Practice;

public class Animal {

    String color = "white";

    void eating() {
        System.out.println("Eating....");
    }

    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        super(); // invoked parent class constructor
        System.out.println("Dog is created");
    }

//    void displaycolor() {
//        System.out.println(color);
//        System.out.println(super.color);
//    }

//    void eating() {
//        System.out.println("Eating bread....");
//        super.eating();
//    }
}
