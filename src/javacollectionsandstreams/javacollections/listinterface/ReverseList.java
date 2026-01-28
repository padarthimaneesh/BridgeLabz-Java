package javacollectionsandstreams.javacollections.listinterface;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> rev = new ArrayList<>();

        for(int i=list.size()-1;i>=0;i--)
            rev.add(list.get(i));

        System.out.println(rev);
    }
}