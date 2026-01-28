package javacollectionsandstreams.javacollections.mapinterface;

import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("A",10,"B",20,"C",15);
        String key=null; int max=0;

        for(var e:map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                key=e.getKey();
            }
        }
        System.out.println(key);
    }
}