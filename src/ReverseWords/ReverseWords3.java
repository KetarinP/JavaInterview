package ReverseWords;

public class ReverseWords3 {

    public static void main(String[] args)  {
        // java is fun
        System.out.println(revWords("java is fun"));
    }

    public static String revWords(String str) {

        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");
        for (int i = words.length -1; i >=0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
