/**
 * celebrity from a video game class that extends Celebrity
 * @author (Arin Gadre)
 * @version (1-29-2020)
 */
public class VideoGameCelebrity extends Celebrity {
    private String game;
    
    /**
     * Creates a video game Celebrity instance with the supplied answer and clue
     * @param name - name of the video game celebrity
     * @param clue - a clue about the video game celebrity
     */
    public VideoGameCelebrity(String answer, String clue, String game)
    {
        super(answer, clue);
        this.game = game;
    }

    /**
     * String representation of the video game celebrity
     */
    @Override
    public String toString()
    {
        return "The celebrity's name is " + getAnswer() + " and their clue is " + getClue() + " and the come from " + game + ".";
    }

    /**
     * Mutator for updating the game
     * @param game - the replacement game that the celebrity comes from
     */
    public void setGame(String show) 
    {
        this.game = game;
    }

    /**
     * Returns the game in which the cartoon character appeared
     * @return game
     */
    public String getGame() 
    {
        return game;
    }

    /**
     * randomly returns either the clue (65% of the time) or the game (35% of the time)
     */
    @Override
    public String getClue() 
    {
        if(Math.random()<0.35)
            return "Appeared in " + game + ".";
        return super.getClue();
    }
}
