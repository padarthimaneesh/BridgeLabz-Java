package coreprogramming.string.Level2;
public class CustomTrim {

    public static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substring(String s, int a, int b) {
        String r = "";
        for (int i = a; i < b; i++) r += s.charAt(i);
        return r;
    }
}
