package Practice;

public class StrPalindromePractice {
    public static void main(String[] args) {
        System.out.println(isPal("anna")); // true
        System.out.println(isPal("apple")); // false
        System.out.println(isPal("civic")); //true
        System.out.println(isPal("a")); //true
        System.out.println(isPal("")); //true
    }

    public static boolean isPal(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().equals(str);
    }
}
