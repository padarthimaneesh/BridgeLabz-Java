package datastructures.linkedlist;
// Doubly Linked List: Library Management System

class Book {
    int id;
    Book prev,next;
    Book(int i){ id=i; }
}

public class LibraryDoublyLinkedList {
    static Book head=null,tail=null;

    static void addBook(int id){
        Book b=new Book(id);
        if(head==null){ head=tail=b; return; }
        tail.next=b;
        b.prev=tail;
        tail=b;
    }

    public static void main(String[] args){
        addBook(101);
        addBook(102);
        System.out.println("Books added");
    }
}