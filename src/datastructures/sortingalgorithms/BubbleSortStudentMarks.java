package datastructures.sortingalgorithms;

public class BubbleSortStudentMarks {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 62, 55};
        bubbleSort(marks);
        for (int m : marks) System.out.print(m + " ");
    }
}