package coreprogramming.methods.level2;
import java.util.Scanner;

public class FriendsComparison {

    public static int findYoungest(int[] age) {
        int min = 0;
        for (int i = 1; i < age.length; i++)
            if (age[i] < age[min]) min = i;
        return min;
    }

    public static int findTallest(int[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++)
            if (height[i] > height[max]) max = i;
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextInt();
        }

        System.out.println("Youngest: " + names[findYoungest(age)]);
        System.out.println("Tallest: " + names[findTallest(height)]);
    }
}
