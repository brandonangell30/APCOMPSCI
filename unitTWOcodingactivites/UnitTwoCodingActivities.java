package unittwocodingactivities;

/*
 * Name: Brandon Angell
 * Date: 9/23/22
 * Purpose: To complete several different coding activities.
 */

import java.util.Scanner;
import java.lang.Math;

public class UnitTwoCodingActivities 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		//Small Activity 1
		int userInt1, userInt2;
		System.out.print("Please enter two integer values: ");
		userInt1 = inputReader.nextInt();
		userInt2 = inputReader.nextInt();
		if (userInt1 > userInt2)
		{
			System.out.println("" + userInt1 + " is the larger value.");
		}
		else if (userInt1 == userInt2)
		{
			System.out.println("The two numbers are equal! ");
		}
		else
		{
			System.out.println("" + userInt2 + " is the larger value. ");
		}
		
		System.out.print("\n");
		
		//Small Activity 2
		double testScore;
		System.out.print("Please input your test score: ");
		testScore = inputReader.nextDouble();
		if (testScore >= 0)
		{
			if (testScore <= 100)
			{
				System.out.print("VALID");
			}
			else
			{
				System.out.print("INVALID");
			}
		}
		else
		{
			System.out.print("INVALID");
		}
		
		System.out.print("\n");
		System.out.print("\n");
		
		//Small Activity 3
		int integer;
		System.out.print("Please enter an integer: ");
		integer = inputReader.nextInt();
		// 0 = even, and 1 = odd for mod 2
		int modAns;
		modAns = (integer%2);
		System.out.print("" + integer);
		if (modAns == 1 )
		{
			System.out.print(" is ODD ");
		}
		else if (modAns == -1)
		{
			System.out.print(" is ODD ");
		}
		else
		{
			System.out.print(" is EVEN ");
		}
		
		if (integer > 0)
		{
			System.out.print("and POSITIVE. ");
		}
		else if (integer < 0)
		{
			System.out.print("and NEGATIVE. ");
		}
		else
		{
			System.out.print("is ZERO. ");
		}
		
		System.out.print("\n");
		System.out.print("\n");
		
		//Small Activity 4
		final int RANDOM_GUESS = 3;
		int minusTwo, plusTwo;
		int userInt;
		System.out.print("Please guess a integer between 1 and 20: ");
		userInt = inputReader.nextInt();
		minusTwo = (RANDOM_GUESS - 2);
		plusTwo = (RANDOM_GUESS + 2);
		if (userInt == RANDOM_GUESS)
		{
			System.out.print("Your guess is correct! Congratulations on being awesome! ");
		}
		else if (userInt == minusTwo)
		{
			System.out.print("You are very close! Please try again! ");
		}
		else if (userInt == plusTwo)
		{
			System.out.print("You are very close! Please try again! ");
		}
		else if (userInt == 2)
		{
			System.out.print("You are very close! Please try again! ");
		}
		else if (userInt == 4)
		{
			System.out.print("You are very close! Please try again! ");
		}
		else
		{
			System.out.print("Are you an idiot? Please stop trying! ");
		}
		
		System.out.print("\n");
		System.out.print("\n");
		
		//Small Activity 5
		double a, b, c;
		System.out.println("The formula for a quadratic function is y= ax\u00b2+bx+c ");
		System.out.print("Please input an \"a\" value for the quadratic formula: ");
		a = inputReader.nextDouble();
		System.out.print("Please input an \"b\" value for the quadratic formula: ");
		b = inputReader.nextDouble();
		System.out.print("Please input an \"c\" value for the quadratic formula: ");
		c = inputReader.nextDouble();
		double positiveAnswer, negativeAnswer;
		//Although answer is not always negative, "b" is being subtracted by the value.
		positiveAnswer = (-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
		negativeAnswer = (-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
		if (((Math.pow(b, 2)-4*a*c))<0)
		{
			System.out.print("There are no real solutions");
		}
		if (((Math.pow(b, 2)-4*a*c))>0)
		{
			System.out.printf("\nOne solution is: %.3f", positiveAnswer);
			System.out.printf("\nThe other solution is: %.3f", negativeAnswer);
		
		}
		inputReader.close();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
