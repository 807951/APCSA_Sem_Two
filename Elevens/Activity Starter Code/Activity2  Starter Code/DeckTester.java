/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        // Deck object number one
        int[] values1 = {2,3,5,7,5,4};
        String[] suits1 = {"Hearts", "Spades", "Diamonds", "Hearts", "Clubs", "Diamonds"};
        String[] ranks1 = {"ace", "two", "queen", "jack", "king", "four"};

        Deck deck1 = new Deck(ranks1, suits1, values1);
        System.out.println(deck1.toString());
        System.out.println("Card: " + deck1.deal());
        System.out.println("Is the deck empty: " + deck1.isEmpty());
        System.out.println("Deck size: " + deck1.size());
        //deck1.shuffle();
        System.out.println("shuffled Deck 1:" + deck1.toString());
        
        // Deck object number two
        int[] values2 = {4,3,5,6,5,0};
        String[] suits2 = {"Hearts", "Spades", "Diamonds", "Spades", "Clubs", "Clubs"};
        String[] ranks2 = {"queen", "two", "three", "jack", "seven", "four"};

        Deck deck2 = new Deck(ranks2, suits2, values2);
        System.out.println(deck2.toString());
        System.out.println("Card: " + deck2.deal());
        System.out.println("Is the deck empty: " + deck2.isEmpty());
        System.out.println("Deck size: " + deck2.size());
        //deck1.shuffle();
        System.out.println("shuffled Deck 2:" + deck2.toString());
        
        // Deck object number two
        int[] values3 = {1,10,3,11,4,7};
        String[] suits3 = {"Hearts", "Diamonds", "Diamonds", "Spades", "Hearts", "Clubs"};
        String[] ranks3 = {"jack", "five", "three", "eight", "king", "four"};

        Deck deck3 = new Deck(ranks3, suits3, values3);
        System.out.println(deck3.toString());
        System.out.println("Card: " + deck3.deal());
        System.out.println("Is the deck empty: " + deck3.isEmpty());
        System.out.println("Deck size: " + deck3.size());
        //deck1.shuffle();
        System.out.println(deck3.toString());
    }
}
