package datastructures.linkedlist;

// Doubly Linked List: Movie Management System

class Movie {
    String title;
    Movie prev, next;

    Movie(String t) { title = t; }
}

public class MovieDoublyLinkedList {
    static Movie head = null, tail = null;

    static void addMovie(String t) {
        Movie m = new Movie(t);
        if (head == null) { head = tail = m; return; }
        tail.next = m;
        m.prev = tail;
        tail = m;
    }

    static void displayForward() {
        Movie t = head;
        while (t != null) { System.out.println(t.title); t = t.next; }
    }

    static void displayReverse() {
        Movie t = tail;
        while (t != null) { System.out.println(t.title); t = t.prev; }
    }

    public static void main(String[] args) {
        addMovie("Inception");
        addMovie("Interstellar");
        displayForward();
        displayReverse();
    }
}