//Sam Verma - solution for Square Free Numbers - finds the number of integers within a range that are not perfect squares

import java.io.*;
import java.util.*;
/** class SquareFree.
*/
public final class SquareFree
{

   public static void main(String[] args) throws Exception
   {
     File file = new File("SquareFree.txt");
     Scanner in = new Scanner(new FileReader(file));
     int numranges = in.nextInt();
     //System.out.println(numranges);
     int count =0;
     for(int i=0;i<numranges;i++){
        int lowbound= in.nextInt();
        int highbound= in.nextInt();
        //System.out.println(lowbound+","+highbound);
        for(int j=lowbound;j<=highbound;j++){
          double root = Math.sqrt((double)j);
          if(root%1 != 0.0){
              count++;
          }
        }
        System.out.println(count);
        count=0;
   }

   }
}
