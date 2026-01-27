package coreprogramming.string.Level2;
public class WordLengthTable {

    public static int length(String s) {
        int c = 0;
        try {
            while (true) { s.charAt(c); c++; }
        } catch (Exception e) { return c; }
    }

    public static String[][] wordLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length(words[i]));
        }
        return result;
    }
}
