//(c) A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {

       return orig.compareTo(other.toString());
  }

  public String toString() { return orig; }
}
