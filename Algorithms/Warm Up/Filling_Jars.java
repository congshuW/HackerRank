import java.util.Scanner;

public class Solution
{    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        long[] noj = new long[s];
        long line = in.nextInt();
        long noc = 0;
        for(int i = 0; i < line; i++)
        {
            long start = in.nextInt();
            long end = in.nextInt();
            long candy = in.nextInt();  
            noc += (end - start + 1)*candy; 
        }
        System.out.println(noc/s);
    }
}