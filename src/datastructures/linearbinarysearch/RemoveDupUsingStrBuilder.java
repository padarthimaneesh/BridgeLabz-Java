package datastructures.linearbinarysearch;

import java.util.HashSet;

class RemoveDupUsingStrBuilder {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder res = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.add(c)) res.append(c);
        }
        System.out.println(res);
    }
}