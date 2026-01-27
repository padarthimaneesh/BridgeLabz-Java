package coreprogramming.controlflows.level3;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);
        System.out.println("BMI = " + bmi);

        if (bmi < 18.4)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 40)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
