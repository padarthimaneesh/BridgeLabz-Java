package coreprogramming.string.Level2;
import java.util.Random;

public class StudentVoting {

    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = r.nextInt(40);
        return ages;
    }

    public static String[][] votingStatus(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return res;
    }
}
