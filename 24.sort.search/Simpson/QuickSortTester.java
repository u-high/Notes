import java.util.Arrays;

public class QuickSortTester{
     
     public static void main(String[] args){
          
          Integer[] stuffs = new Integer[7];
          stuffs[0]=10;
          stuffs[1]=5;
          stuffs[2]=3;
          stuffs[3]=8;
          stuffs[4]=7;
          stuffs[5]=15;
          stuffs[6]=2;
          
          System.out.println(Arrays.toString(stuffs));
          
          QuickSort ob = new QuickSort();
          ob.quickSort(stuffs, 0, stuffs.length-1);
          
           System.out.println(Arrays.toString(stuffs));
          
     }
}