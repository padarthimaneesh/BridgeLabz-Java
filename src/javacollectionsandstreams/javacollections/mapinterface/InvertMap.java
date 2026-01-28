package javacollectionsandstreams.javacollections.mapinterface;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("A",1,"B",2,"C",1);
        Map<Integer,List<String>> res=new HashMap<>();

        for(var e:map.entrySet()){
            res.computeIfAbsent(e.getValue(),k->new ArrayList<>()).add(e.getKey());
        }
        System.out.println(res);
    }
}