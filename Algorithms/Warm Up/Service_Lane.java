import java.util.Scanner;

public class Solution
{
    public static int services_lane(int[] lane, int start, int end)
    {
        int small = lane[start];
        for(int i = 1; i <= end-start; i++)
        {
            if(lane[start + i] < small)
            {
                small = lane[start + i];
            }
        }
        return small;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);  
        int s = in.nextInt();
        int[] width = new int[s];
        int nonsense = in.nextInt();
        for(int i = 0; i< s; i++)
        {
              width[i] = in.nextInt();
        }
        while(in.hasNextLine())
        {
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(services_lane(width, start, end));
        }
    }
}