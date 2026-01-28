package javacollectionsandstreams.javacollections.queueinterface;

import java.util.*;

class Patient implements Comparable<Patient>{
    String name; int sev;
    Patient(String n,int s){name=n;sev=s;}
    public int compareTo(Patient p){return p.sev-sev;}
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq=new PriorityQueue<>();
        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));

        while(!pq.isEmpty())
            System.out.println(pq.remove().name);
    }
}