package coreprogramming.string.Level1;
public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        text.length(); // Exception
    }

    public static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see crash
        handleException();
    }
}
