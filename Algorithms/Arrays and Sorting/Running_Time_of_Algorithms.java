import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Running_Time_of_Algorithms 
{
	public static void main(String[] args) 
    {
        
            Scanner in = new Scanner(System.in);
            int size= in.nextInt();
            int[] ar = new int[size];
            for(int i = 0; i < size; i++)
            {
                ar[i] = in.nextInt();
            }
            insertionSort(ar);
    }  
        
    public static void insertionSort(int[] ar)
    {
    		int count = 0;
            int l = ar.length;
            for(int i = 1; i < l; i++)
            {
                int temp = ar[i];
                for(int j = i-1; j>=0 && ar[j] > temp; j--)
                {
                    ar[j+1] = ar[j];
                    ar[j] = temp;
                    count++;
                }
            }
            System.out.print(count);
    }
}
