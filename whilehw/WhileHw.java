package whilehw;

/*
 * Name: Brandon Angell
 * Date: 10/12/2022
 * Purpose: To complete the various activities on the While Homework. 
 */

import java.util.Scanner;

public class WhileHw 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
//		int testScore, sum;
//		double counter;
//		sum = 0;
//		testScore = 0;
//		counter = -1;
//		
//		
//		while (testScore>=0)
//		{
//			counter++;
//			sum += testScore;
//			System.out.print("Enter a test score: ");
//			testScore = inputReader.nextInt();
//		}
//		System.out.print("The mean of the test scores is: " + sum/counter);
//
//		System.out.print("\n");
//		System.out.print("\n");
		
		//activity 2
		
		int num1, num2;
		System.out.print("Please enter two integers: ");
		num1 = inputReader.nextInt();
		num2 = inputReader.nextInt();
		if (num1 % 2 == 1)
		{
			num1++;
		}
		while (num1 <= num2)
		{
			System.out.print(num1 + " ");
			num1 += 2;
		}
		if (num2 % 2 == 1)
		{
			num2++;
		}
		while (num2 <= num1)
		{
			System.out.print(num2 + " ");
			num2 += 2;
		}
		inputReader.close();

		
	}

}
