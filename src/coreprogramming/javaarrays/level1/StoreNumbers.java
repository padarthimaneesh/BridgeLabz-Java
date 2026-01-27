package coreprogramming.arrays.level1;
import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double value = input.nextDouble();

            if (value <= 0 || index == 10)
                break;

            numbers[index++] = value;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println(numbers[i]);
        }

        System.out.println("Total sum = " + total);
    }
}

