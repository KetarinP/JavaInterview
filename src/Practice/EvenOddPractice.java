package Practice;

import java.util.Random;

public class EvenOddPractice {
    public static void main(String[] args) {
        int num = new Random().nextInt(50);

        if (num % 2 == 0) {
            System.out.println("Yes, even: " + num);
        } else {
            System.out.println("No, odd: " + num);
        }

//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println("Yes, even: " + i);
//            } else {
//                System.out.println("No, odd: " +i);
//            }
//        }
    }
}
