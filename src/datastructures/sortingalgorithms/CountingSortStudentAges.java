package datastructures.sortingalgorithms;

public class CountingSortStudentAges {

    static void countingSort(int[] arr) {
        int min = 10, max = 18;
        int[] count = new int[max - min + 1];

        for (int age : arr) count[age - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 14, 10};
        countingSort(ages);
        for (int a : ages) System.out.print(a + " ");
    }
}