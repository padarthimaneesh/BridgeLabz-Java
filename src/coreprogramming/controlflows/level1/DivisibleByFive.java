package coreprogramming.controlflows.level1;
import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean result = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}


