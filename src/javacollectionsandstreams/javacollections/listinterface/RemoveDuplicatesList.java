package javacollectionsandstreams.javacollections.listinterface;

import java.util.*;

public class RemoveDuplicatesList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}