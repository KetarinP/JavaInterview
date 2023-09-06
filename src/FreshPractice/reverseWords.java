package FreshPractice;

public class reverseWords {

    public static void main(String[] args) {

        System.out.println(revWords("string words"));
        System.out.println(revWords("hello world"));
        System.out.println(revWords("apple"));

    }

    public static String revWords(String words) {
        StringBuilder result = new StringBuilder();

        String[] str = words.split(" ");

        for (int i = str.length -1; i >= 0; i--) {
            result.append(str[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
