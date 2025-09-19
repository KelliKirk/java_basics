package Week8.ex15;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void add (Card card){
        cards.add(card);
    }

    public void print(){
        for (Card card : cards){
            System.out.println(card);
        }
    }

    private int sumOfValues() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();  // Requires getValue() method in Card
        }
        return sum;
    }

    // 15.3 Sorting
    public void sort(){
        Collections.sort(cards);
    }

    // 15.4 Comparing hands
    @Override
    public int compareTo(Hand o) {
        return this.sumOfValues() - o.sumOfValues();
    }

    // 15.6 Sort Against Suit

    public void sortAgainstSuit(){
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
}
