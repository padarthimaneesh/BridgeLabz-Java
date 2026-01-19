package datastructures.linkedlist;

class Item {
    int id, qty;
    double price;
    Item next;

    Item(int i,int q,double p){ id=i; qty=q; price=p; }
}

public class InventoryLinkedList {
    static Item head=null;

    static void addItem(int i,int q,double p){
        Item it=new Item(i,q,p);
        if(head==null){ head=it; return; }
        Item t=head;
        while(t.next!=null)t=t.next;
        t.next=it;
    }

    static void totalValue(){
        double sum=0;
        Item t=head;
        while(t!=null){ sum+=t.qty*t.price; t=t.next; }
        System.out.println(sum);
    }

    public static void main(String[] args){
        addItem(1,2,100);
        addItem(2,1,200);
        totalValue();
    }
}