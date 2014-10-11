import java.util.Scanner;

public class Solution
{
    public static long cut(long c)
    {
        long piece = 0;
        long row = 0;
        long col = 0;
        if(c == 0 || c == 1)
        {
            return piece;
        }
        else
        {
            row = 1;
            col = 1;
            piece = 1;
            for(int i = 3; i<= c; i++)
            {
                if(i%2 == 1)
                {
                    row++;
                    piece+=col;
                }
                if(i%2 == 0)
                {
                    col++;
                    piece+=row;
                }
            }    
        }
        return piece;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int i = 0; i < s; i++)
        {
            long k = in.nextInt();
            System.out.println(cut(k));    
        }
    }
}