package coreprogramming.methods.level1;
import java.util.Scanner;

public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds = " + rounds);
    }
}
