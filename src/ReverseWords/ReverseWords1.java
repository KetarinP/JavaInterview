package ReverseWords;

public class ReverseWords1 {

    public static void main(String[] args) {

        System.out.println(revWords1("String str"));
        System.out.println(revWords1("Testing this program"));
        System.out.println(revWords1("java is fun"));
        System.out.println(revWords1("hello world"));
    }

    public static String revWords1(String str) {

        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
