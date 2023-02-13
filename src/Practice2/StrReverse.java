package Practice2;

public class StrReverse {
    public static void main(String[] args) {
        System.out.println(RevStr("hello"));
    }
    public static String RevStr(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}
