package OOP_Practice;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        int a=100;
        try {
            System.out.println(a/0);
        } catch (Exception e) {
            System.out.println("Exception is handled");
        } finally {
            System.out.println("Entered into finally block");
        }
        System.out.println("Program exited");
    }
}
