package coreprogramming.string.Level3;
import java.util.Scanner;

public class BMICalculation {

    public static String[][] calculateBMIAndStatus(double[][] hw) {
        String[][] result = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightM = hw[i][1] / 100;
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 40) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(hw[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Height  Weight  BMI   Status");
        for (String[] row : data) {
            System.out.println(row[0] + "   " + row[1] + "   " + row[2] + "   " + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble(); // weight
            hw[i][1] = sc.nextDouble(); // height
        }

        String[][] result = calculateBMIAndStatus(hw);
        display(result);
    }
}
