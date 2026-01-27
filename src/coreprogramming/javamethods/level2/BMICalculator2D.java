package coreprogramming.methods.level2;
import java.util.Scanner;

public class BMICalculator2D {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 40) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            persons[i][0] = input.nextDouble(); // weight
            persons[i][1] = input.nextDouble(); // height
        }

        calculateBMI(persons);
        String[] status = getBMIStatus(persons);

        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + persons[i][0] +
                    " Height: " + persons[i][1] +
                    " BMI: " + persons[i][2] +
                    " Status: " + status[i]);
        }
    }
}
