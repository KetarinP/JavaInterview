package FreshPractice;

public class ReverseStr {

    public static void main(String[] args) {

        System.out.println(revStr("hello"));
        System.out.println(revStr("apple"));
        System.out.println(revStr("no"));
        System.out.println(revStr("a"));
        System.out.println(revStr(""));
        System.out.println(revStr(null));
    }

    public static String revStr(String str) {

        if (str == null) {
            return str;
        }

        StringBuilder revRes = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            revRes.append(str.charAt(i));
        }
        return revRes.toString();
    }
}
