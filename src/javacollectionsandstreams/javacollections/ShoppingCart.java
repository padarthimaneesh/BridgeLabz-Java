package javacollectionsandstreams.javacollections;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        HashMap<String,Integer> prices = new HashMap<>();
        prices.put("Laptop",70000);
        prices.put("Mouse",500);
        prices.put("Keyboard",1500);

        LinkedHashMap<String,Integer> cart = new LinkedHashMap<>(prices);

        TreeMap<Integer,String> sortedByPrice = new TreeMap<>();
        for (var e : prices.entrySet())
            sortedByPrice.put(e.getValue(), e.getKey());

        System.out.println("Cart:");
        System.out.println(cart);

        System.out.println("Sorted by Price:");
        System.out.println(sortedByPrice);
    }
}