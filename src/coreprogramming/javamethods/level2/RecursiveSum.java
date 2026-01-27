package coreprogramming.methods.level2;
import java.util.Scanner;

public class RecursiveSum {

    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);

        System.out.println("Recursive Sum = " + rSum);
        System.out.println("Formula Sum = " + fSum);
    }
}
