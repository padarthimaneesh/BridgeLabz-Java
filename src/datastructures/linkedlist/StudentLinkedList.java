package datastructures.linkedlist;

// Singly Linked List: Student Record Management

class Student {
    int rollNo, age;
    String name;
    char grade;
    Student next;

    Student(int r, String n, int a, char g) {
        rollNo = r; name = n; age = a; grade = g;
        next = null;
    }
}

public class StudentLinkedList {
    static Student head = null;

    static void addStudent(int r, String n, int a, char g) {
        Student s = new Student(r, n, a, g);
        if (head == null) { head = s; return; }
        Student t = head;
        while (t.next != null) t = t.next;
        t.next = s;
    }

    static void deleteStudent(int r) {
        if (head == null) return;
        if (head.rollNo == r) { head = head.next; return; }
        Student t = head;
        while (t.next != null && t.next.rollNo != r) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }

    static void display() {
        Student t = head;
        while (t != null) {
            System.out.println(t.rollNo+" "+t.name+" "+t.age+" "+t.grade);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        addStudent(1,"A",20,'B');
        addStudent(2,"B",21,'C');
        display();
        deleteStudent(1);
        display();
    }
}