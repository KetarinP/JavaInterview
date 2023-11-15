package OOP_Practice;

public class MethodOverloading {

    // Method overloading: A class contains more than one method with the same name is called as method overloading
    // We must follow these rules
    // 1. Number of parameters
    // 2. Order of parameters
    // 3. Data type of parameters

    int a;
    int b;

    // first method
    void sum() {
        a = 10;
        b = 20;
        System.out.println(a + b);
    }

    // second method
    void sum(int x, int y) {
        int a = x;
        int b = y;
        System.out.println(a + b);
    }

    // third method
    void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    // fourth method
    void sum(int x, double y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        mo.sum(); // call the first method = 30
        mo.sum(100, 200); // call the second method = 300
        mo.sum(10, 20, 30); // call the third method = 60
        mo.sum(10, 10.5); // call the fourth method = 20.5
    }
}
