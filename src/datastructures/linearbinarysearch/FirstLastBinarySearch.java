package datastructures.linearbinarysearch;

class FirstLastBinarySearch {
    static int search(int[] a, int x, boolean first) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                if (first) r = m - 1; else l = m + 1;
            } else if (a[m] < x) l = m + 1;
            else r = m - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3};
        System.out.println(search(a,2,true)+" "+search(a,2,false));
    }
}