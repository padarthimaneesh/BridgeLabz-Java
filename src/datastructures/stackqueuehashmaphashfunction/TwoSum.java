package datastructures.stackqueuehashmaphashfunction;
import java.util.HashMap;

class TwoSum {

    static void findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        findTwoSum(arr, target);
    }
}