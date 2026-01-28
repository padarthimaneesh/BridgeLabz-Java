package javacollectionsandstreams.javacollections.queueinterface;
import java.util.*;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n=5;
        Queue<String> q=new LinkedList<>();
        q.add("1");

        for(int i=0;i<n;i++){
            String s=q.remove();
            System.out.println(s);
            q.add(s+"0");
            q.add(s+"1");
        }
    }
}