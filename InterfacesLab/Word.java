//© A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {
     String temp = other.toString();
     if(temp.length() == orig.length())
        return 0;
     else if(temp.length() < orig.length())
        return -1; 
     else
        return 1;
  }

  public String toString() { return orig; }
}
