package forhomework;

/*
 * Name: Brandon Angell
 * Date: 10/19/22
 * Purpose: To complete several different tasks involving for loops.
 */

import java.util.Scanner;

public class ForHomework 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		//activity1
		
		for (int i=23; i < 90; i++)
		{
			if (i%10 == 2)
			{
				System.out.println(i);
			}
			else
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.print("\n");
		System.out.print("\n");
		
		//activity2
		
		for (int j = 1; j<51; j++)
		{
			if (j%2 == 0)
			{
				System.out.println(j);
			}
		}
		
		System.out.print("\n");
		System.out.print("\n");
		
		//activity3
		
		int userInt;
		System.out.print("Enter a number between 0 and 100: \n");
		userInt = inputReader.nextInt();
		System.out.print("\n");
		if (userInt < 0 || userInt > 100)
		{
			System.out.print("ERROR");
		}
		else
		{
			for (; userInt >=0 && userInt <=100; userInt+=1)
			{
				if(userInt%20 == 9)
				{
					System.out.println(userInt);
				}
				else
				{
					System.out.print(userInt + " ");
				}
			}
		}
		
		
		inputReader.close();
	}

}
