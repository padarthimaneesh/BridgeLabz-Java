package datastructures.linkedlist;

// Circular Linked List: Task Scheduler

class Task {
    int id;
    Task next;

    Task(int id) { this.id = id; next = this; }
}

public class TaskCircularLinkedList {
    static Task head = null;

    static void addTask(int id) {
        Task t = new Task(id);
        if (head == null) { head = t; return; }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    static void display() {
        if (head == null) return;
        Task t = head;
        do {
            System.out.println(t.id);
            t = t.next;
        } while (t != head);
    }

    public static void main(String[] args) {
        addTask(1);
        addTask(2);
        display();
    }
}