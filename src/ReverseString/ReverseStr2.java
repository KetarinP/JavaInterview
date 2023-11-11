package ReverseString;

public class ReverseStr2 {

    public static void main(String[] args) {

        System.out.println(revStr("String"));
        System.out.println(revStr("a"));
        System.out.println(revStr(""));
        System.out.println(revStr(null));
    }

    public static String revStr(String str) {

        if (str == null) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() -1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
