package datastructures.linearbinarysearch;

class FirstNegativeLinearSearch {
    public static void main(String[] args) {
        int[] a = {4, 6, -2, 8};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) { System.out.println(i); return; }
        }
        System.out.println(-1);
    }
}