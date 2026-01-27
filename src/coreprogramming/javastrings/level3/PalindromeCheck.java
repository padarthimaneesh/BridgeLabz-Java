package coreprogramming.string.Level3;
public class PalindromeCheck {

    public static boolean checkLoop(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static boolean checkRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return checkRecursive(s, i + 1, j - 1);
    }

    public static boolean checkArray(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
            if (arr[i] != arr[n - i - 1]) return false;
        return true;
    }
}
