package coreprogramming.string.Level3;
public class DeckOfCards {

    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;
        return deck;
    }

    public static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;

        String[][] result = new String[players][cards];
        int idx = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[idx++];

        return result;
    }

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        shuffle(deck);

        String[][] players = distribute(deck, 4, 5);
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String card : players[i])
                System.out.println(card);
        }
    }
}
