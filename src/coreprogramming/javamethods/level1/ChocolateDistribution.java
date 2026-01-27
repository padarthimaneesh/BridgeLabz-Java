package coreprogramming.methods.level1;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[0] +
                " chocolates and remaining is " + result[1]);
    }
}
