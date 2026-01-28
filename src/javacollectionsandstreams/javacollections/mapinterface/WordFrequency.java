package javacollectionsandstreams.javacollections.mapinterface;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String s="Hello world hello Java";
        Map<String,Integer> map=new HashMap<>();

        for(String w:s.toLowerCase().split(" "))
            map.put(w,map.getOrDefault(w,0)+1);

        System.out.println(map);
    }
}