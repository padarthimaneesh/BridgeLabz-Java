package javacollectionsandstreams.javaexceptions;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String m){ super(m); }
}

public class BankExceptionHandler {
    double bal = 1000;

    void withdraw(double amt) throws InsufficientBalanceException {
        if (amt < 0) throw new IllegalArgumentException();
        if (amt > bal) throw new InsufficientBalanceException("Insufficient balance!");
        bal -= amt;
        System.out.println("Withdrawal successful, new balance: " + bal);
    }

    public static void main(String[] args) {
        BankExceptionHandler b = new BankExceptionHandler();
        try {
            b.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}