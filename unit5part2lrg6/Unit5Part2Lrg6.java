package unit5part2lrg6;

import java.util.Arrays;

/*
 * Name: Brandon Angell
 * Date: 2/2/2023
 * Purpose: To compute different statistics using code.
 */

public class Unit5Part2Lrg6 
{
	//to find the frequency
	public static int findFrequency(int n, int[] arr)
	{
		int a = 0;
		int b = 0;
		while(b<arr.length)
		{
			if (n==arr[b])
			{
				a++;
			}
			b++;
		}
		return a;
	}
	
	//to find the mean
	public static double findMean(int[] arr2)
	{
		int mean = 0;
		for (int i = 0; i<arr2.length; i++)
		{
			mean += arr2[i];
		}
		return mean/100.0;
	}
	
	//to find the median
	public static double findMedian(int[] arr3)
	{
		Arrays.sort(arr3);
		int c = arr3[50];
		int d = arr3[51];
		double sum = c + d;
		double median = sum/2;
		return median;	
	}

	public static void main(String[] args) 
	{
		int[] array = new int [100];
		int i = 0;
		
		//random numbers
		while (i<array.length)
		{
			array[i] = (int)(Math.random()*101)-50;
			i++;
		}
		
		
		int count1 = -50;
		int count2 = -50;
		for (int rows = 0; rows<10; rows++)
		{
			System.out.print("Number:\t");
			int numLimit = 0;
			while (numLimit<10)
			{
				System.out.print(count1 + "\t");
				count1++;
				numLimit++;
			}
			if (count1==50)
			{
				System.out.print(count1);
			}
			System.out.print("\nFreq:\t");
			int frequencyLimit = 0;
			while (frequencyLimit<10)
			{
				System.out.print(findFrequency(count2, array) + "\t");
				count2++;
				frequencyLimit++;
			}
			System.out.println();
			if (count2 == 50)
			{
				System.out.print(findFrequency(count2, array) + "\t");
			}
			System.out.println();
		}
		int mode = 0;
		for (int g = -50; g<50; g++)
		{
			if (findFrequency(g, array) > findFrequency(mode, array))
			{
				mode = g;
			}
		}
		System.out.print("\nThe mean is: " + findMean(array));
		System.out.print("\nThe median is: " + findMedian(array));
		System.out.print("\nThe mode is: " + mode);


	}

}
