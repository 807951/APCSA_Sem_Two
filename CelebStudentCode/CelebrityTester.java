/**
 * Tests Celebrity class
 * @author Arin Gadre
 * @version 1-23-2020
 */
public class CelebrityTester
{
    public static void main(String[] args){
        Celebrity celeb = new Celebrity("Elon Musk", "CEO of Tesla and SpaceX");
        System.out.println("Celeb name: " + celeb.getAnswer() +"  Celeb clue: "
        + celeb.getClue());
        celeb.setAnswer("Shrek");
        celeb.setClue("Often says 'What are you doing in my swamp?!?!?'");
        System.out.println("Celeb name: " + celeb.getAnswer() +"  Celeb clue: "
        + celeb.getClue());
    }
}
