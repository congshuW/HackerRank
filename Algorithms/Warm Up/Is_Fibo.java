import java.util.Scanner;

public class Solution
{
    public static boolean fibo(long input)
    {
        if(input == 0)
        {
            return true;    
        }
        if(input == 1)
        {
            return true;    
        }
        else
        {
            long x = 0;
            long y = 1;
            long sum = x + y;
            while(sum < input)
            {
                x = y;
                y = sum;
                sum = x + y;
            }
            if(sum == input)
                return true;
            else
                return false;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int i = 0; i < s; i++)
        {
            long a = in.nextLong();
            if(fibo(a))
            {
                System.out.println("IsFibo");    
            }
            else
                System.out.println("IsNotFibo"); 
        }
    }
}