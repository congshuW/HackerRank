import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Chocolate_Feast 
{
	public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for(int i = 0; i < size; i++)
        {
            int mon = in.nextInt();	//money
            int pri = in.nextInt();	//price
            int wra = in.nextInt();	//wrappers
            int cho = mon/pri;	//chocolate
            int chow = mon/pri;	//chocolate wrappers
            while(chow >= wra)
            {
                chow-=wra;
                cho++;
                chow++;
            }
            ar[i] = cho;
        }
        for(int j: ar)
        {
            System.out.println(j);
        }   
    }
}
