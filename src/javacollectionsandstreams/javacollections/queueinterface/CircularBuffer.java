package javacollectionsandstreams.javacollections.queueinterface;

public class CircularBuffer {
    static int size=3;
    static int[] buf=new int[size];
    static int idx=0;

    static void add(int x){
        buf[idx%size]=x;
        idx++;
    }

    public static void main(String[] args){
        add(1); add(2); add(3); add(4);
        for(int i:buf) System.out.print(i+" ");
    }
}