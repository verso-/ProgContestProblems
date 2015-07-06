//Sam Verma
//Prime Sieve example, solution to "Is it Prime?"
package PrimeSieve;

import java.util.*;
import java.io.*;
/** class Prime.
*/
public final class Prime
{
   /** Constructor. */
   public Prime()
   {
   }

   public static void main(String[] args) throws Exception
   {
      File file = new File("prime.in");
      Scanner in = null;
      in = new Scanner(new FileReader(file));
      int numvals = in.nextInt();
      //System.out.println(numvals);
      int j,test=0;
      for(j=0;j<numvals;j++){
      	test = in.nextInt();
      	//System.out.println(test);
      	isPrime(test);
      }
   }

   public static int isPrime(int n){
      int i;
      if(n<4){
         System.out.println("1");
         return 1;
      }
      for(i=2; i<Math.sqrt(n)+1;i++){
      	if(i!=n && n%i==0){
      	   System.out.println("0");
      	   return 0;
      	}
      }
      System.out.println("1");
      return 1;
   }
}
