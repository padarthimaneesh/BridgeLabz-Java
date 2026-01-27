package coreprogramming.controlflows.level3;
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}

