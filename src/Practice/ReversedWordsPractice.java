package Practice;

public class ReversedWordsPractice {
    public static void main(String[] args) {

        System.out.println(revWords("I love java"));
        System.out.println(revWords("hello world"));
        System.out.println(revWords("apple"));
    }

    public static String revWords(String str) {
        StringBuilder res = new StringBuilder();

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}
