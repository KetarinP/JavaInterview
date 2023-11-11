package ReverseString;

public class ReverseStr {

    public static void main(String[] args) {

        System.out.println(reverseStr("ketarin"));
        System.out.println(reverseStr("apple"));
        System.out.println(reverseStr("game"));
        System.out.println(reverseStr("on"));
        System.out.println(reverseStr("eyes"));
    }

    public static String reverseStr(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
