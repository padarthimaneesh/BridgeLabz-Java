package coreprogramming.string.Level2;
import java.util.Random;

public class RockPaperScissors {

    public static String computerChoice() {
        String[] c = {"rock","paper","scissors"};
        return c[new Random().nextInt(3)];
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        return "Computer";
    }
}
