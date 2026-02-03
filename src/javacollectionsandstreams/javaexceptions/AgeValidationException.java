package javacollectionsandstreams.javaexceptions;

import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String m) { super(m); }
}

public class AgeValidationException {
    static void check(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be 18 or above");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            check(sc.nextInt());
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
