package datastructures.stackqueuehashmaphashfunction;

import java.util.HashMap;

class ZeroSumSubarrays {

    static void findZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0 || map.containsKey(sum)) {
                System.out.println("Zero sum subarray exists");
                return;
            }
            map.put(sum, i);
        }
        System.out.println("No zero sum subarray");
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        findZeroSum(arr);
    }
}