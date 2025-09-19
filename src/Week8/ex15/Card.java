package Week8.ex15;

public class Card implements Comparable<Card>{
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;

    private int value;  // Stores the card value (2-14)
    private int suit;   // Stores the suit (0-3)

    public Card(int value, int suit){
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        String valueStr = "";
        String suitStr = "";

        // Convert value (2-14) to string
        if (value >= 2 && value <= 10) {
            valueStr = "" + value;
        } else if (value == 11) {
            valueStr = "J";
        } else if (value == 12) {
            valueStr = "Q";
        } else if (value == 13) {
            valueStr = "K";
        } else if (value == 14) {
            valueStr = "A";
        }

        // Convert suit (0-3) to string
        if (suit == SPADES) {
            suitStr = "Spades";
        } else if (suit == DIAMONDS) {
            suitStr = "Diamonds";
        } else if (suit == HEARTS) {
            suitStr = "Hearts";
        } else if (suit == CLUBS) {
            suitStr = "Clubs";
        }

        return valueStr + " of " + suitStr;
    }

    public int getValue(){
        return this.value;
    }


// 15.1 Comparable cards
    @Override
    public int compareTo(Card o) {
        // First compare by value
        if (this.value != o.value) {
            return this.value - o.value;
        } // If values are equal, compare by suit
        return this.suit - o.suit;
    }

    public int getSuit() {
        return this.suit;
    }
}
