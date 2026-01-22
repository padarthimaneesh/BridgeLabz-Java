package datastructures.linkedlist;

// Doubly Linked List: Undo/Redo Functionality for Text Editor

class State {
    String text;
    State prev,next;
    State(String t){ text=t; }
}

public class UndoRedoLinkedList {
    static State current=null;

    static void addState(String t){
        State s=new State(t);
        if(current!=null){ current.next=s; s.prev=current; }
        current=s;
    }

    static void undo(){ if(current!=null && current.prev!=null) current=current.prev; }

    static void redo(){ if(current!=null && current.next!=null) current=current.next; }

    public static void main(String[] args){
        addState("A");
        addState("B");
        undo();
        System.out.println(current.text);
    }
}
