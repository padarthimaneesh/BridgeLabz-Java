package javacollectionsandstreams.javacollections;

import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        HashMap<Integer,Integer> accounts = new HashMap<>();
        accounts.put(101,5000);
        accounts.put(102,8000);
        accounts.put(103,3000);

        TreeMap<Integer,Integer> sortedByBalance = new TreeMap<>();
        for (var e : accounts.entrySet())
            sortedByBalance.put(e.getValue(), e.getKey());

        Queue<Integer> withdrawals = new LinkedList<>();
        withdrawals.add(101);
        withdrawals.add(103);

        while(!withdrawals.isEmpty()) {
            int acc = withdrawals.remove();
            accounts.put(acc, accounts.get(acc) - 1000);
        }

        System.out.println("Accounts:");
        System.out.println(accounts);

        System.out.println("Sorted by Balance:");
        System.out.println(sortedByBalance);
    }
}