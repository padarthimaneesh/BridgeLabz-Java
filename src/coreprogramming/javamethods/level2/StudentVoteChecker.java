package coreprogramming.methods.level2;
import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            ages[i] = input.nextInt();
            System.out.println(canStudentVote(ages[i]) ?
                    "Can Vote" : "Cannot Vote");
        }
    }
}
