package datastructures.linkedlist;

// Circular Linked List: Online Ticket Reservation System

class Ticket {
    int id;
    Ticket next;
    Ticket(int i){
        id=i;
        next=this;
    }
}

public class TicketReservationCircularList {
    static Ticket head=null;

    static void addTicket(int id){
        Ticket t=new Ticket(id);
        if(head==null){
            head=t;
            return;
        }
        Ticket temp=head;
        while(temp.next!=head)temp=temp.next;
        temp.next=t;
        t.next=head;
    }

    static void display(){
        Ticket t=head;
        do{
            System.out.println(t.id);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        addTicket(11);
        addTicket(22);
        display();
    }
}