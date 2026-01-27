package coreprogramming.methods.level2;
import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{-b / (2 * a)};

        return new double[]{
                (-b + Math.sqrt(delta)) / (2 * a),
                (-b - Math.sqrt(delta)) / (2 * a)
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);
        for (double r : roots)
            System.out.println("Root: " + r);
    }
}
