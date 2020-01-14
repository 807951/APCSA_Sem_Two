//© A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import java.util.*;
public class WordRunner
{
    public static void main ( String[] args )
    {
        Word x = new Word("dog");
        Word y = new Word("cat");
        System.out.println( x.compareTo(y) );

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Hi"));
        words.add(new Word("Hello"));
        words.add(new Word("Hola"));
        Collections.sort(words);
        System.out.print(words);
        //ArrayList<Word>
        //make a list of Word
        //call Collections.sort() and sort the list
        //print the list
    }
}