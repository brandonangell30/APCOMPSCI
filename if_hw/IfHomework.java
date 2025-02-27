package ifhomework;

/*
 * Name: Brandon Angell
 * Date: 9/21/22
 * Purpose: To let the user know if they are going to get snow. To also compare integers.
 */

import java.util.Scanner;

public class IfHomework 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);

		//Snow if less than 32
		int userDegrees;
		System.out.print("Please enter today's temperature: ");
		userDegrees = inputReader.nextInt();
		if (userDegrees <= 32)
		
		{
			System.out.println("Prepare for snow!");
		}
		else
		{
			System.out.println("No snow today!");
		}
		System.out.print("Thank you for using APCS.com.");
		
		System.out.print("\n");
		System.out.print("\n");
		
		//Compares integers
		int userInt1, userInt2;
		System.out.print("Please enter two integers: ");
		userInt1 = inputReader.nextInt();
		userInt2 = inputReader.nextInt();
		if (userInt1 == userInt2)
		{
			System.out.println("Your numbers are equal!");
			System.out.print("" + userInt1 + " and " + userInt2 + " are the same.");
			
		}
		else
		{
			System.out.println("Your numbers are not equal.");
			System.out.print("" + userInt1 + " and " + userInt2 + " are not the same.");
		}
		
		System.out.print("\n");
		System.out.print("\n");
		int grade;
		System.out.print("Please enter the grade as a number: ");
		grade = inputReader.nextInt();
		if (grade == 4)
		{
			System.out.print("A");
		}
		else if (grade == 3)
		{
			System.out.print("B");
		}
		else if (grade == 2)
		{
			System.out.print("C");
		}
		else if (grade == 1)
		{
			System.out.print("D");
		}
		else if (grade == 0)
		{
			System.out.print("F");
		}
		else
		{
			System.out.print("That isn't a grade, you geezer!");
		}
		
		inputReader.close();
		
	}
}