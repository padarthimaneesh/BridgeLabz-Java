package coreprogramming.controlflows.level1;
import java.util.Scanner;

public class NaturalSumCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;

            System.out.println("While Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}
