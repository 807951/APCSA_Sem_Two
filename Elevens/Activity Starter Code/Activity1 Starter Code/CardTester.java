/**
 * This is a class that tests the Card class.
 * Author: Arin Gadre
 * Date: 2-3-2020
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("3", "Hearts", 3);
        Card card2 = new Card("2", "Spades", 2);
        Card card3 = new Card("6", "Clubs", 6);
        
        // Card 1
        System.out.println("Does one match two: " + card1.matches(card2));
        System.out.println("Suit of Card 1: " + card1.suit());
        System.out.println("Rank of Card 1: " + card1.rank());
        System.out.println("Point value of Card 1: " + card1.pointValue());
        System.out.println(card1.toString());
        
        // Card 2
        System.out.println("\nDoes 2 match 3: " + card2.matches(card3));
        System.out.println("Suit of Card 2: " + card2.suit());
        System.out.println("Rank of Card 2: " + card2.rank());
        System.out.println("Point value of Card 2: " + card2.pointValue());
        System.out.println(card2.toString());
        
        // Card 3
        System.out.println("\nDoes 3 match 1: " + card3.matches(card1));
        System.out.println("Suit of Card 3: " + card3.suit());
        System.out.println("Rank of Card 3: " + card3.rank());
        System.out.println("Point value of Card 3: " + card3.pointValue());
        System.out.println(card3.toString());
    }
}
