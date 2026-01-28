package javacollectionsandstreams.javacollections.queueinterface;

import java.util.*;

public class StackUsingQueues {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    void push(int x){
        q2.add(x);
        while(!q1.isEmpty()) q2.add(q1.remove());
        Queue<Integer> t=q1; q1=q2; q2=t;
    }

    int pop(){ return q1.remove(); }

    public static void main(String[] args){
        StackUsingQueues s=new StackUsingQueues();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());
    }
}