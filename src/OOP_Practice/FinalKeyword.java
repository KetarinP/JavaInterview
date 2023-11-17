package OOP_Practice;

// Final keyword can be applied to
// variable - final variable, we cannot change value
// method - method cannot be overridden in the child class
// Class - class cannot be extended into the child class
// Final is constant. You cannot change the value in the future

public class FinalKeyword {
    final int speed = 40; // final variable, we cannot change value

    public static void main(String[] args) {

        FinalKeyword fk = new FinalKeyword();
        //fk.speed=100; // compile error
        System.out.println(fk.speed);
    }
}
