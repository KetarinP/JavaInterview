package OOP_Practice;

// An interface is a blueprint of a class
// Its contains final and static variable
// interface contains an abstract method. It is a method that contains definition but not a body
// Methods in an interface are public by default
// interface supports the functionality of multiple inheritance
// we can define interface with interface keyword
// A class extends another class, an interface extends another interface but a class implements an interface
// we can create an object reference for an interface, but we cannot instantiate an interface

interface Demo {
    int a = 100; // by default variables in an interface are static and final
    void d1(); // abstract method, by default it is public
}

interface Demo2 {
    int b = 200; // by default variables in an interface are static and final
    void d2(); // abstract method, by default it is public
}

public class InterfaceDemo implements Demo, Demo2 {

    public void d1() {
        System.out.println(a);
    }

    public void d2() {
        System.out.println(b);
    }

    public static void main(String[] args) {

        InterfaceDemo t = new InterfaceDemo();
        t.d1();
        t.d2();

        System.out.println("===");

        Demo d = new InterfaceDemo();
        d.d1();

        Demo2 d2 = new InterfaceDemo();
        d2.d2();

    }
}
