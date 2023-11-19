package OOP_Practice;

// One try block can have multiple catch blocks
// Finally block will always execute

// 1) Checked -> Exceptions checked/identified by the compiler
// Examples: InterruptedException, IOException, and FileNotFoundException etc...
// 2) Un-checked Exceptions which are not checked/identified by compiler
// Examples: ArithmeticException, NullPointerException, NumberFormatException, ArraysIndexOutOfBoundsException

public class ExceptionsDemo {

    public static void main(String[] args) {

        System.out.println("Program is started");
        System.out.println("Program is in progress");

/*        int a = 100;

        int res = 0;
        try {
           // System.out.println(a/0); // Throw Arithmetic Exception
             res = a/0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is handled");
        }
        System.out.println(res);

        */

        String s = null;
        try {
            System.out.println(s.length()); // throws NullPointerException
        } catch (Exception e) {
            System.out.println("Exception is handled");
        }

        System.out.println("Program is completed");
        System.out.println("Program is exited");
    }
}
