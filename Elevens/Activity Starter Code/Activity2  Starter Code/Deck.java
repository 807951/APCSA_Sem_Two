import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<Card>();
        size = ranks.length;
        if(checkArrays(ranks, suits, values) == true)
            for(int i = 0; i < size; i++)
                cards.add(new Card(ranks[i], suits[i], values[i])); 
        shuffle();
    }

    public boolean checkArrays(String [] ranks, String[] suits, int[] values){
        if ((ranks.length != suits.length) || (ranks.length != values.length)){
            System.out.println("You have more elements in 1 or 2 array(s) than the others!"); 
            return false;
        }
        return true;
    }

    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return cards.size() == 0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        Random rand = new Random();
        size = 52; // put size = 6 to test code
        for(int i = 0; i < size/2; i++){ 
            int randomIndexToSwap = rand.nextInt(cards.size() - 1);
            Card temp = cards.get(randomIndexToSwap);
            cards.set(randomIndexToSwap, cards.get(i));
            cards.set(i, temp);
        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        size--;
        return(cards.get(size));
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";
        for (int k = size - 1; k >= 0; k--) {
            rtn += cards.get(k);
            if (k != 0)
                rtn += ", ";
            if ((size - k) % 2 == 0)
            // Insert carriage returns so entire deck is visible on console.
                rtn += "\n";
        }
        rtn += "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn += cards.get(k);
            if (k != size)
                rtn += ", ";
            if ((k - cards.size()) % 2 == 0)
            // Insert carriage returns so entire deck is visible on console.
                rtn += "\n";
        }
        rtn += "\n";
        return rtn;
    }
}
