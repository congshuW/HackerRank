import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Intro_to_Tutorial_Challenges 
{
	public static void main(String[] args) 
	{

        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i < n; i++)
        {
        	ar[i]=in.nextInt(); 
        }
        for(int i = 0; i < n; i++)
        {
            if(v == ar[i])
            {
            	System.out.println(i);
            }
        }   
    }
}
