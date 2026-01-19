package datastructures.stackqueuehashmaphashfunction;

import java.util.LinkedList;

class CustomHashMap {

    class Node {
        int key, value;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    LinkedList<Node>[] table = new LinkedList[10];

    CustomHashMap() {
        for (int i = 0; i < 10; i++) {
            table[i] = new LinkedList<>();
        }
    }

    void put(int key, int value) {
        int index = key % 10;
        for (Node node : table[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        table[index].add(new Node(key, value));
    }

    Integer get(int key) {
        int index = key % 10;
        for (Node node : table[index]) {
            if (node.key == key) return node.value;
        }
        return null;
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 100);
        map.put(11, 200);
        System.out.println(map.get(1));
        System.out.println(map.get(11));
    }
}