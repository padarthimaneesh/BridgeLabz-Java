package javacollectionsandstreams.javacollections.setinterface;

import java.util.*;

public class SetEquality {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(s1.equals(s2));
    }
}