package Week8.ex15;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Card first = new Card(2, Card.DIAMONDS);
        Card second = new Card(14, Card.CLUBS);
        Card third = new Card(12, Card.HEARTS);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // 15.1 Comparing cards
        Card card1 = new Card(5, Card.SPADES);   // 5 of Spades
        Card card2 = new Card(5, Card.HEARTS);   // 5 of Hearts
        Card card3 = new Card(7, Card.CLUBS);    // 7 of Clubs

        System.out.println("Comparing " + card1 + " to " + card2 + ": " + card1.compareTo(card2));
        System.out.println("Comparing " + card1 + " to " + card3 + ": " + card1.compareTo(card3));
        System.out.println("Comparing " + card3 + " to " + card1 + ": " + card3.compareTo(card1));

        // 15.2 Hand
        Hand hand = new Hand();

        /* hand.add( new Card(2, Card.SPADES) );
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(12, Card.HEARTS) );
        hand.add( new Card(2, Card.CLUBS) );

        hand.sort(); // 15.3 Sort
        hand.print();*/


        // 15.4 Comparing hands

        Hand hand1 = new Hand();

        hand1.add( new Card(2, Card.SPADES) );
        hand1.add( new Card(14, Card.CLUBS) );
        hand1.add( new Card(12, Card.HEARTS) );
        hand1.add( new Card(2, Card.CLUBS) );

        Hand hand2 = new Hand();

        hand2.add( new Card(11, Card.DIAMONDS) );
        hand2.add( new Card(11, Card.CLUBS) );
        hand2.add( new Card(11, Card.HEARTS) );

        int comparison = hand1.compareTo(hand2);

        if ( comparison < 0 ) {
            System.out.println("the most valuable hand contains the cards");
            hand2.print();
        } else if ( comparison > 0 ){
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        }

        // 15.5 Sorting against different criteria

        ArrayList<Card> cards = new ArrayList<Card>();

        cards.add( new Card(3, Card.CLUBS) );
        cards.add( new Card(2, Card.DIAMONDS) );
        cards.add( new Card(14, Card.CLUBS) );
        cards.add( new Card(12, Card.HEARTS) );
        cards.add( new Card(2, Card.CLUBS) );

        SortAgainstSuit suitSorter = new SortAgainstSuit();
        Collections.sort(cards, suitSorter );

        for (Card c : cards) {
            System.out.println( c );
        }

        hand.add( new Card(12, Card.HEARTS) ); // 15.6 Sort Against Suit
        hand.add( new Card(4, Card.CLUBS) );
        hand.add( new Card(2, Card.DIAMONDS) );
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(7, Card.HEARTS) );
        hand.add( new Card(2, Card.CLUBS) );

        hand.sortAgainstSuit();
        hand.print();

    }
}
