package Swap;

public class Swap3 {

    public static void main(String[] args) {
        // a=200
        // b=100

        int a = 100;
        int b = 200;

        a = a + b; // 100+200=300
        b = a - b; // 300-200=100
        a = a - b; // 200-100=100

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("=====");

        int c = 400;
        int d = 300;
        int tmp;

        tmp = c;
        c = d;
        d = tmp;

        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }
}
