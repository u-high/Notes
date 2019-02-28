//(c) A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import static java.util.ArrayList;
import static java.util.Collections;

public class WordRunner
{
 public static void main ( String[] args )
 {
  Word x = new Word("cat");
  Word y = new Word("catcat");
  System.out.println( x.compareTo(y) );
  
  //make a list of Word
  List<Word> list = new ArrayList<Word>();
  
  //call Collections.sort() and sort the list
  //print the list
  }
}