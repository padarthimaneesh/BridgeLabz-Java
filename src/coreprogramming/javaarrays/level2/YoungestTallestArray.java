package coreprogramming.arrays.level2;
import java.util.Scanner;

public class YoungestTallestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextInt();
        }

        int youngest = 0, tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}
