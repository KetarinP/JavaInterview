package ReverseWords;

public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(revWords("pretty world"));
        System.out.println(revWords("orange"));
        System.out.println(revWords("earth is not flat"));
        System.out.println(revWords("where is vacation"));

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
