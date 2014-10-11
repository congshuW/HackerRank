import java.util.*;

public class QuickSort1_Partition 
{
	public static void partition(int[] ar) 
    {
       int p = ar[0];
       int s = ar.length;
       int[] ar2 = new int[s];
       int j = 0;
       for(int i = 1; i < s; i++)
       {
    	   if(ar[i]<= p)
           {
    		   ar2[j] = ar[i];
               j++;
           }
       }
       ar2[j] = p;
       j++;
       for(int x = 1; x <s; x++ )
       {
    	   if(ar[x] > p)
           {
    		   ar2[j] = ar[x];
    		   j++;
           }
       }
       printArray(ar2);
    }   

	public static void printArray(int[] ar2) 
	{
         for(int n: ar2)
         {
            System.out.print(n+" ");
         }
           System.out.println("");
	}
       
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        {
        	ar[i]=in.nextInt(); 
        }
        partition(ar);
    }    
}
