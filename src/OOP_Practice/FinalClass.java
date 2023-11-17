package OOP_Practice;

final class Bike1 { // final class, we cannot extend into child class
     void run() {
        System.out.println("Running....");
    }
}

class Honda1 extends Bike1 { // error
    void run() {
        System.out.println("Started....");
    }
}

public class FinalClass {
}
