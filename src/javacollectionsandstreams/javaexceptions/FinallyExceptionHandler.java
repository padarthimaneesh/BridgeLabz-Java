package javacollectionsandstreams.javaexceptions;

import java.util.*;

public class FinallyExceptionHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(sc.nextInt() / sc.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }
    }
}