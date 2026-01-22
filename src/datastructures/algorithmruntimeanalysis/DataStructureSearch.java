package datastructures.algorithmruntimeanalysis;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int key = 500;

        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) arr[i] = i;

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 1000; i++) {
            hashSet.add(i);
            treeSet.add(i);
        }

        System.out.println(Arrays.stream(arr).anyMatch(x -> x == key));
        System.out.println(hashSet.contains(key));
        System.out.println(treeSet.contains(key));
    }
}