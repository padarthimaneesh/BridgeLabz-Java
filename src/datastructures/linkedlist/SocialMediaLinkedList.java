package datastructures.linkedlist;

// Singly Linked List: Social Media Friend Connections

class User {
    int id;
    User next;
    User(int i){ id=i; }
}

public class SocialMediaLinkedList {
    static User head=null;

    static void addUser(int id){
        User u=new User(id);
        u.next=head;
        head=u;
    }

    static void display(){
        User t=head;
        while(t!=null){ System.out.println(t.id); t=t.next; }
    }

    public static void main(String[] args){
        addUser(1);
        addUser(2);
        display();
    }
}