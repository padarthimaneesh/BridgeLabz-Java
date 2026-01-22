package datastructures.linearbinarysearch;
class MatrixBinarySearch {
    public static void main(String[] args) {
        int[][] m = {{1,3,5},{7,9,11}};
        int t = 9, r = m.length, c = m[0].length;
        int l = 0, h = r*c - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            int val = m[mid/c][mid%c];
            if (val == t) { System.out.println(true); return; }
            if (val < t) l = mid + 1;
            else h = mid - 1;
        }
        System.out.println(false);
    }
}