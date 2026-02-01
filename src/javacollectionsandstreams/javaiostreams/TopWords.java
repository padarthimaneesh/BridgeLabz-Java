package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.*;

public class TopWords {
    public static void main(String[] args) throws Exception {
        Map<String,Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String w : line.toLowerCase().split("\\W+"))
                    if(!w.isEmpty()) map.put(w, map.getOrDefault(w,0)+1);
            }
        }

        map.entrySet().stream()
                .sorted((a,b)->b.getValue()-a.getValue())
                .limit(5)
                .forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
    }
}