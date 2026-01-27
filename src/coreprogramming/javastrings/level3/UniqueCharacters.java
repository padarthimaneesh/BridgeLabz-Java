package coreprogramming.string.Level3;
import java.util.Scanner;

public class UniqueCharacters {

    public static int length(String s) {
        int c = 0;
        try {
            while (true) { s.charAt(c); c++; }
        } catch (Exception e) {}
        return c;
    }

    public static char[] uniqueChars(String text) {
        int len = length(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);
        System.out.println("Unique Characters:");
        for (char c : unique) System.out.print(c + " ");
    }
}
