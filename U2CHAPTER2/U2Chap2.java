package u2chap2;

/*
 * Name: Brandon Angell
 * Date: 10/13/22
 * Purpose: To complete 5 small activities on a menu.
 */

import java.util.Scanner;
public class U2Chap2 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int userInput=1;
		while (userInput != 0)
		{
		System.out.println("Welcome to my activity extravaganza");
		System.out.println("Please choose one of my activities to try out!");
		System.out.println("1 - Factorial of an integer ");
		System.out.println("2 - Prime number of a integer ");
		System.out.println("3 - Input machine ");
		System.out.println("4 - Celsius equivalents ");
		System.out.println("5 - Consecutive integers ");
		System.out.println("0 - Exit the Menu");
		System.out.print("Your selection: ");
		userInput = inputReader.nextInt();
		System.out.print("\n");
		{
		switch (userInput)
		{
		case 1:
			int num1, counter1 ;
			System.out.println("What integer would you like to compute the factorial of? ");
			num1 = inputReader.nextInt();
			if (num1 > 1)
			{
				System.out.print(num1);
				counter1 = 1;
				while (num1>1)
				{
					counter1 = counter1*num1;
					counter1 = (num1-1)*(counter1);
					num1 = (num1-2);
				}
				System.out.println("! = " + counter1);
				
			}
			else if (num1 == 0)
			{
				System.out.print("0! = 1 ");
			}
			else if (num1 == 1)
			{
				System.out.print("1! = 1 ");
			}
			else
			{
				System.out.print("Sorry, no negatives allowed!!!");
			}
			
			System.out.print("\n");
			break;
			
		case 2:
			int number;
			boolean flag = false;
			System.out.print("Please enter a postive integer: ");
			number = inputReader.nextInt();
			if (number == 1)
			{
				System.out.print("NOT PRIME\n");
			}
			if (number == 0)
			{
				System.out.print("NOT PRIME\n");
			}
			else
			{
				for (int i = 2; i<= number / 2; i++)
				{
					if (number % i == 0)
					{
						flag = true;
					}
				}
				if (flag != true)
				{
					System.out.print("PRIME\n");
				}
				else
				{
					System.out.print("NOT PRIME\n");
				}
				
			}
			
			
			
			
			
			System.out.print("\n");
			break;
			
		case 3:
			int integer, largestNumber;
			integer = 1;
			largestNumber = Integer.MIN_VALUE;
			while (integer!=0)
			{
				System.out.print("Please enter an integer: ");
				integer = inputReader.nextInt();
				if (integer > largestNumber)
				{
					largestNumber = integer;
				}
				else if (integer < largestNumber)
				{
					largestNumber += 0;
				}
			}
			System.out.println("The largest number is: " + largestNumber);
			System.out.print("\n");
			break;
			
		case 4:
			int farStart, farEnd;
			double celsiusStart;
			System.out.print("Please enter the starting Fahrenheit temperarture: ");
			farStart = inputReader.nextInt();
			System.out.print("Please enter the ending Fahrenheit temperature: ");
			farEnd = inputReader.nextInt();
			celsiusStart = 0;
			System.out.print("Fahrenheit\tCelsius");
			while (farStart <= farEnd)
			{
				celsiusStart = ((((double)farStart-32)*5)/9);
				System.out.printf("\n" + farStart + "\t\t%.2f", celsiusStart);
				farStart++;
				
			}
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 5:
			int input,int1, c, result, one;
			System.out.print("Please enter the number you would like the sum to exceed: ");
			input = inputReader.nextInt();
			one = 1;
			int1 = 1;
			c = 0;
			result = 0;
			while (result <= input)
			{
				result += int1;
				c++;
				int1++;

			}
			System.out.println("You must add the " + c + " numbers between " + one + " and " + c + " to get " + result + " and exceed " + input);
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 0:
		{
			System.out.println("You have exited the menu.");
			break;
		}
		
		default:
		{
			System.out.println("Invalid option, Please try again!");
			System.out.print("\n");
			System.out.print("\n");
			break;
		}
		}

		
		}
	
	}
		inputReader.close();
	}
}
