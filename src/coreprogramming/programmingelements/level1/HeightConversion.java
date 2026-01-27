package coreprogramming.programmingelements.level1;
import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet + " and inches is " + inches);
    }

}
