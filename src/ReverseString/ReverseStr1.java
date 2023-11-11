package ReverseString;

public class ReverseStr1 {

    public static void main(String[] args) {

        System.out.println(revRes("phophrom"));
    }

    public static String revRes(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
