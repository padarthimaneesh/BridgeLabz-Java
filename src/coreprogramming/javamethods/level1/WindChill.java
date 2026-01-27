package coreprogramming.methods.level1;
import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp +
                (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature = " + windChill);
    }
}
