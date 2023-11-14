package ReverseString;

public class ReverseStr4 {

    public static void main(String[] args ) {
        // print string in reverse
        // apple
        // a
        // empty
        // null
        System.out.println(revStr("apple"));
        System.out.println(revStr("a"));
        System.out.println(revStr(""));
        System.out.println(revStr(null));
    }

    public static String revStr(String str) {

        if (str == null) {
            return str;
        }

        String result = "";

        for (int i=str.length()-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
