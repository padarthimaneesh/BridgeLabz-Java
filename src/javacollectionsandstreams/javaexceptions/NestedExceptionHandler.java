package javacollectionsandstreams.javaexceptions;

public class NestedExceptionHandler {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        try {
            int v = a[5];
            try {
                System.out.println(v/0);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}