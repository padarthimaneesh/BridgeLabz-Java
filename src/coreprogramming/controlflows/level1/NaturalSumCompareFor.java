package coreprogramming.controlflows.level1;
import java.util.Scanner;

public class NaturalSumCompareFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++)
                sumLoop += i;

            int sumFormula = n * (n + 1) / 2;

            System.out.println("For Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}
