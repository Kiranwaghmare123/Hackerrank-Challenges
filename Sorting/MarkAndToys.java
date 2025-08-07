
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class MarkAndToys 
{
	public static void main(String[] args)throws IOException
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int prices[] = new int[n];
		int i,j;
		for (i = 0; i < n; i++)
		{	
			prices[i] = in.nextInt();
		}
		j=maximumToys(prices,k);
		System.out.println(j);
	}
	public static int maximumToys(int[] prices,int k)
	{
		int n=prices.length;
		Arrays.sort(prices);
		//main programming
    		int toyCount,i,sum;
		sum=toyCount= 0;
		for (i = 0; i < n; i++) 
		{
			sum += prices[i];
			if (sum <= k) 
			{
				toyCount++;
			} 
			else 
			{
				break;
			}
		}
		return toyCount;
	}
}
