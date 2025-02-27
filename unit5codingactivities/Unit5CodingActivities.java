package unit5codingactivities;

/*
 * Name: Brandon Angell
 * Date: January 5th, 2023
 * Purpose: To complete several different coding activities.
 */

import java.util.Scanner;

public class Unit5CodingActivities 
{
	
	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		String s1;
		System.out.print("Please enter a String to print vertically: ");
		s1 = inputReader.next();
		int c = 0;
		while (c<s1.length())
		{
			System.out.println(s1.charAt(c));
			c++;
		}
		
		System.out.println("\n\n");
		
		String s2;
		System.out.print("Please enter a String to print diagonally: ");
		s2 = inputReader.next();
		int a = 0;
		while (a<s2.length())
		{
			System.out.println(s2.charAt(a));
			a++;
			for (int b = 0; b<a; b++)
			{
				System.out.print("\t");
			}
		}
		
		inputReader.close();
		
	}

}
