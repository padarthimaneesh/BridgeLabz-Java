package coreprogramming.arrays.level1;
import java.util.Scanner;

public class MultiplicationRangeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] result = new int[4];
        int idx = 0;

        for (int i = 6; i <= 9; i++) {
            result[idx++] = number * i;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[idx++]);
        }
    }
}
