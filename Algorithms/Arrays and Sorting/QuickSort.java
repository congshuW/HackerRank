import java.util.*;

public class QuickSort 
{
	public static int partition(int[] ar, int start, int end) 
	{
		int pivot = ar[start];
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		for (int i = start + 1; i < end; i++)
        {
            //(ar[i] <= pivot ? left : right).add(ar[i]);
            if(ar[i] <= pivot)
            {
                left.add(ar[i]);
            }
            else
            {
                right.add(ar[i]);
            }
		}
		for (int i = 0; i < left.size(); i++)
		{
			ar[start + i] = left.get(i);
		}
		ar[start + left.size()] = pivot;
		for (int i = 0; i < right.size(); i++) 
		{
			ar[start + i + left.size() + 1] = right.get(i);
		}
		return start + left.size();
	}

	public static void quickSort(int[] ar, int start, int end) 
	{
		if(end - start <= 1) 
		{
			return;
		}
		int part = partition(ar, start, end);
		quickSort(ar, start, part);
		quickSort(ar, part + 1, end);
		printArray(ar, start, end);
	}

	public static void printArray(int[] ar, int start, int end) 
	{
		for (int i = start; i < end; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++)
		{
			ar[i] = in.nextInt();
		}
		quickSort(ar, 0, n);
	}
}
