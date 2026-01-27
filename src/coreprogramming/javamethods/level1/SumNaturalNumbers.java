package coreprogramming.methods.level1;
import java.util.Scanner;

public class SumNaturalNumbers {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = findSum(n);
        System.out.println("Sum of natural numbers = " + sum);
    }
}
