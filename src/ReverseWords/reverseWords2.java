package ReverseWords;

public class reverseWords2 {

    public static void main(String[] args) {

        System.out.println(revWords("String str"));
        System.out.println(revWords("I love java"));
        System.out.println(revWords("java is fun"));
    }

    public static String revWords(String str) {

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
