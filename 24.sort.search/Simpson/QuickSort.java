import java.util.Arrays;

public class QuickSort{
     
     
     void quickSort(Comparable[] stuff, int low, int high)
     {
          if (low < high)
          {
               int spot = partition(stuff, low, high);
               quickSort(stuff, low, spot);
               quickSort(stuff, spot+1, high);
               System.out.println("End of quicksort");
          }
     }
     
     int partition(Comparable[] stuff, int low, int high) 
     {
          Comparable pivot = stuff[low]; 
          int bot = low-1; 
          int top = high+1;  
          while(bot<top) { 
               while (stuff[--top].compareTo(pivot) > 0); 
               while (stuff[++bot].compareTo(pivot) < 0);
               if(bot >= top){
                    System.out.println("returning top:  " + top);
                    return top;
               }
               Comparable temp = stuff[bot];
               stuff[bot] = stuff[top];
               stuff[top] = temp;
               System.out.println("swap    " + Arrays.toString(stuff) + "   bot is: " + bot + "  top is:  " + top);
          }
          return top;  //this should never be reached, it just fixes the error about missing return statement
     }
     
     
     
     
}