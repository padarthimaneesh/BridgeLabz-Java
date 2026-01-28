package javacollectionsandstreams.javacollections;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        HashMap<String,Integer> votes = new HashMap<>();
        votes.put("Alice",120);
        votes.put("Bob",150);
        votes.put("Charlie",100);

        LinkedHashMap<String,Integer> insertionOrder = new LinkedHashMap<>(votes);
        TreeMap<String,Integer> sorted = new TreeMap<>(votes);

        System.out.println("Votes:");
        System.out.println(votes);

        System.out.println("Insertion Order:");
        System.out.println(insertionOrder);

        System.out.println("Sorted Result:");
        System.out.println(sorted);
    }
}