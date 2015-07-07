//Sam Verma
//MCSS example, solution to "Profits"

package Profits;
import java.util.*;
import java.io.*;
/** class Profits.
*/
public final class Profits
{
   /** Constructor. */
   public Profits()
   {
   }

   public static void main(String[] args) throws Exception
   {
      File file = new File("profits.in");
      Scanner in = new Scanner(new FileReader(file));
      int numcases = in.nextInt();
      while(numcases != 0){
         int vals[] = new int[numcases];
         int i=0;
         for(i=0;i<numcases;i++)
         {
            vals[i] = in.nextInt();
           // System.out.println(vals[i]);
         }
        //System.out.println(vals.length);
         int max=-100,sum=0,start=0,end=0,j=0,k=0;
        for(j=0;j<vals.length;j++)
         {
            sum=0;
		for(k=j;k<vals.length;k++)
		{
		   sum+=vals[k];
		   if(sum>max)
		   {
		      max=sum;
		      start=j;
		      end=k;
		   }
		}

         }
         System.out.println(max);
         numcases = in.nextInt();
      }
      in.close();
   }
}
