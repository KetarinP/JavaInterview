package OOP_Practice;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program is started");
        System.out.println("Program is in progress");

/*        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Exception is handled");
        }*/

        Thread.sleep(5000);


        System.out.println("Program is completed");
        System.out.println("Program is exited");
    }
}
