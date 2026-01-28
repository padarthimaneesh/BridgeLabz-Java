package javacollectionsandstreams.javacollections;

import java.time.LocalDate;
import java.util.*;

class Policy {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(int p, String h, LocalDate e, String c, double pr) {
        policyNumber = p;
        holderName = h;
        expiryDate = e;
        coverageType = c;
        premium = pr;
    }

    public String toString() {
        return policyNumber + " " + holderName + " " + expiryDate + " " + coverageType + " " + premium;
    }
}

public class InsurancePolicyManagementSystem {

    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    static TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    static void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);
        treeMap.put(p.expiryDate, p);
    }

    static Policy getPolicy(int number) {
        return hashMap.get(number);
    }

    static void expiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);
        for (Policy p : hashMap.values())
            if (!p.expiryDate.isBefore(now) && !p.expiryDate.isAfter(limit))
                System.out.println(p);
    }

    static void byHolder(String name) {
        for (Policy p : hashMap.values())
            if (p.holderName.equalsIgnoreCase(name))
                System.out.println(p);
    }

    static void removeExpired() {
        LocalDate now = LocalDate.now();
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(now));
    }

    public static void main(String[] args) {
        addPolicy(new Policy(1,"Alice",LocalDate.now().plusDays(20),"Health",5000));
        addPolicy(new Policy(2,"Bob",LocalDate.now().minusDays(2),"Auto",3000));
        addPolicy(new Policy(3,"Alice",LocalDate.now().plusDays(40),"Home",7000));

        System.out.println(getPolicy(1));
        expiringSoon();
        byHolder("Alice");
        removeExpired();
        System.out.println(hashMap.values());
    }
}