package datastructures.algorithmruntimeanalysis;

import java.util.Arrays;

public class SortingComparison {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void mergeSort(int[] arr) {
        Arrays.sort(arr);
    }

    static void quickSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}