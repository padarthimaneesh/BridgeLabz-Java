package datastructures.linearbinarysearch;
class PeakBinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,20,4,1};
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if ((m == 0 || a[m] > a[m-1]) &&
                    (m == a.length-1 || a[m] > a[m+1])) {
                System.out.println(a[m]); return;
            }
            if (m > 0 && a[m] < a[m-1]) r = m - 1;
            else l = m + 1;
        }
    }
}