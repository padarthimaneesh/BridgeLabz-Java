package javacollectionsandstreams.javaexceptions;

public class InterestValidationException {
    static double calc(double amt,double rate,int y) {
        if (amt < 0 || rate < 0) throw new IllegalArgumentException();
        return amt * rate * y / 100;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calc(-1,5,2));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input");
        }
    }
}