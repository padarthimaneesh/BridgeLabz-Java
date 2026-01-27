package coreprogramming.controlflows.level3;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;

        if (number <= 1)
            isPrime = false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Is Prime Number? " + isPrime);
    }
}
