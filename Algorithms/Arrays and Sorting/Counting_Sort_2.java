import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Counting_Sort_2 
{
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] a = new int[s];
        for(int i = 0; i< s; i++)
        {
            a[i] = in.nextInt();
        }
        sort(a);
        printArray(a);
    }
    
    public static void sort(int[] a)
    {
       if (a.length == 0)
              return;
       int max = a[0], min = a[0];
       for (int i = 1; i < a.length; i++) 
       {
           if (a[i] > max)
                max = a[i];
           else if (a[i] < min)
                min = a[i];
       }
       int numValues = max - min + 1;
       int[] counts = new int[numValues];
       for (int i = 0; i < a.length; i++) 
       {
            counts[a[i]-min]++;
       }
       int outputPos = 0;
       for (int i = 0; i < numValues; i++) 
       {
            for (int j = 0; j < counts[i]; j++) 
            {
                a[outputPos] = i+min;
                outputPos++;
            }
        }
    }
    
    public static void printArray(int[] a)
    {
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
