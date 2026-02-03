package javacollectionsandstreams.javaexceptions;


public class ArrayAccessExceptionHandler {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
