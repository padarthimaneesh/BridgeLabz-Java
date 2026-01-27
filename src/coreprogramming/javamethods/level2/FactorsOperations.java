package coreprogramming.methods.level2;
import java.util.Scanner;

public class FactorsOperations {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int n : arr) p *= n;
        return p;
    }

    public static double squareSum(int[] arr) {
        double s = 0;
        for (int n : arr) s += Math.pow(n, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Sum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + squareSum(factors));
    }
}
