package ReverseString;

public class ReverseStr3 {

    public static void main(String[] args) {
        System.out.println(revStr("java"));
        System.out.println(revStr(null));
        System.out.println(revStr("o"));
        System.out.println(revStr(""));
    }

    public static String revStr(String str) {

        if (str == null) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
