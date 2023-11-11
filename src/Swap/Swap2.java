package Swap;

public class Swap2 {

    public static void main(String[] args) {

        int i = 11;
        int j = 14;

        i = i + j; // 11 + 14 = 25
        j = i - j; // 25 - 14 = 11
        i = i - j; // 25 - 11 = 14

        System.out.println("i " + i);
        System.out.println("j " + j);
    }
}
