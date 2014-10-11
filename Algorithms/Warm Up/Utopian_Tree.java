import java.util.Scanner;

public class Solution
{
    public static int cal(int a)
    {
        int height = 1;
        if(a == 0)
        {
            return 1;
        }
        else
        {
            for(int i = 1; i <= a; i++)
            {
                if(i % 2 != 0)
                {
                    height = height * 2;   
                }
                else
                {
                    height = height + 1;    
                }
            }
        }
        return height;
    }
    
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int i = 0; i < s; i++)
        {
            int cycles = in.nextInt();
            System.out.println(cal(cycles));
        }
    }
}