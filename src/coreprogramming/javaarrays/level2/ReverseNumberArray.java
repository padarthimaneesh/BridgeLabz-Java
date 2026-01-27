package coreprogramming.arrays.level2;
import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int i = 0;

        while (number != 0) {
            digits[i++] = number % 10;
            number /= 10;
        }

        for (int d : digits)
            System.out.print(d);
    }
}
