package coreprogramming.methods.level1;
import java.util.Scanner;

public class Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of handshakes = " + handshakes);
    }
}
