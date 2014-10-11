import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lonely_Integer 
{
	public static int lonelyinteger(int[] a) 
    {
        if(a.length == 1)
        {
            return a[0];
        }
        int[] ac = new int[a.length];
        for(int i = 0; i< a.length; i++)
        {
            int count = 0;
            int temp = a[i];
            for(int j = 0; j< a.length; j++)
            {
                if(a[j] == temp)
                {
                    count++;
                }
            }
            ac[i] = count;
        }
        int res;
        for(int x = 0; x< ac.length; x++)
        {
            if(ac[x] <=1)
            {
                res = a[x];
                return res;
            } 
        }
       return 0;
    }

	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int res;
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        for(int _a_i = 0; _a_i < _a_size; _a_i++) 
        {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        res = lonelyinteger(_a);
        System.out.println(res);    
    }
}
