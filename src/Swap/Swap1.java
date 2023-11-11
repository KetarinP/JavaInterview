package Swap;

public class Swap1 {

    public static void main(String[] args) {
        int i = 15;
        int j = 10;

        i = i + j; // 15 + 10 = 25
        j = i - j; // 25 - 10 = 15
        i = i - j; // 25 - 15 = 10

        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}
