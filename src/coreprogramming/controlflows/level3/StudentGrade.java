package coreprogramming.controlflows.level3;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Mark = " + average);

        if (average >= 80)
            System.out.println("Grade A - Level 4");
        else if (average >= 70)
            System.out.println("Grade B - Level 3");
        else if (average >= 60)
            System.out.println("Grade C - Level 2");
        else if (average >= 50)
            System.out.println("Grade D - Level 1");
        else if (average >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R - Remedial");
    }
}
