package Practice;

public class NumberPalindromePractice {
    public static void main(String[] args) {

        System.out.println(isNumPal(121)); // true
        System.out.println(isNumPal(123)); // false
        System.out.println(isNumPal(12344321)); // true
        System.out.println("---");
        System.out.println(isNumPal(0)); // true
        System.out.println(isNumPal(-121)); // true
        System.out.println(isNumPal(-123)); // false
        System.out.println(isNumPal(1)); // true

    }

    public static boolean isNumPal(int num) {
        int reversed = 0;

        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        while (num > reversed) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return num == reversed || reversed / 10 == num;
    }
}
