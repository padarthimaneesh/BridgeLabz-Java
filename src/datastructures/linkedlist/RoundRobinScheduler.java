package datastructures.linkedlist;
// Circular Linked List: Round Robin Scheduling Algorithm

class Process {
    int pid;
    Process next;
    Process(int p){ pid=p; next=this; }
}

public class RoundRobinScheduler {
    static Process head=null;

    static void addProcess(int p){
        Process pr=new Process(p);
        if(head==null){ head=pr; return; }
        Process t=head;
        while(t.next!=head)t=t.next;
        t.next=pr;
        pr.next=head;
    }

    static void display(){
        Process t=head;
        do{
            System.out.println(t.pid);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        addProcess(1);
        addProcess(2);
        display();
    }
}