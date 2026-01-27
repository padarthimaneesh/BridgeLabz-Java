package coreprogramming.controlflows.level1;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial is " + fact);
    }
}
