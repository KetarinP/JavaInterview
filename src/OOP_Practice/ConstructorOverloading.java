package OOP_Practice;

public class ConstructorOverloading {

    // Constructor is a method that has the same name as the class name
    // Constructor will not return to any value
    // Constructor will be invoked at the time object creation. (we don't need to call the constructor explicitly).
    // Constructor will take the parameter just like a method
    // Constructor is used for initialize the values.
    // Constructor overloading: A class contains more than one constructor is called constructor overloading
    //
    // The different between a method and constructor
    // A method name can be any name but constructor name must be the same as the class name
    // A method takes parameters and will return values but constructor may take parameters but will not return value
    // If you want to call the method, you have to create an object then call the method. Constructor automatically
    // invoked at the time of creating object

    // Two types of constructor
    // 1. default constructor - a constructor without any parameter
    // 2. parameterized constructor - a constructor with parameters

    // This keyword. When using this.a=a; it means  this variable "a" is belongs to this class and not from external variables
    //


    int a=0;
    int b=0;
    double c=0;

    ConstructorOverloading() {
        a=10;
        b=20;
        c=20.5;
    }

    ConstructorOverloading(int x, int y) {
        a=x;
        b=y;
    }

    ConstructorOverloading(int x, double y) {
        a=x;
        c=y;
    }

    ConstructorOverloading(int x, int y, double z) {
        a=x;
        b=y;
        c=z;
    }

    ConstructorOverloading(int x, double y, int z) {
        a=x;
        b=z;
        c=y;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        ConstructorOverloading co=new ConstructorOverloading(); // call the first constructor
        co.display();

        ConstructorOverloading co2=new ConstructorOverloading(10,20); // call the second constructor
        co2.display();

        ConstructorOverloading co3=new ConstructorOverloading(10,20.5); // call the third constructor
        co3.display();

        ConstructorOverloading co4=new ConstructorOverloading(10,20, 20.5); // call the fourth constructor
        co4.display();

        ConstructorOverloading co5=new ConstructorOverloading(10,20.5, 30); // call the fifth constructor
        co5.display();
    }
}
