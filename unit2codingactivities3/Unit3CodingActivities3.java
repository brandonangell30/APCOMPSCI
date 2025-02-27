package unit2codingactivities3;

import java.util.Scanner;

public class Unit3CodingActivities3 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int userInput=1;
		while (userInput != 0)
		{
		System.out.println("Welcome to my activities buddy");
		System.out.println("Please choose one of my activities now!!!!!!!!!");
		System.out.println("1 - Square and Cube of 1-10 ");
		System.out.println("2 - Sum all integers inclusive between two integers ");
		System.out.println("3 - Largest Value, Smallest Value and Sum ");
		System.out.println("4 - Box made of X's ");
		System.out.println("5 - Right Triangle made of X's ");
		System.out.println("6 - Multiplication table that goes up to 5 ");
		System.out.println("0 - Exit the Menu");
		System.out.print("Your selection: ");
		userInput = inputReader.nextInt();
		System.out.print("\n");
		
		switch (userInput)
		{
		case 1:
			
			for (int x = 1; x<11; x++)
			{
				System.out.println( x + " squared is " + (x*x));
				System.out.println( x + " cubed is " + (x*x*x));
			}
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 2:
			
			int first, second;
			System.out.print("Please enter the starting number: ");
			first = inputReader.nextInt();
			System.out.print("Please enter the ending number: ");
			second = inputReader.nextInt();
			int sum = 0;
			for (int c = first; c<=second; c++)
			{
				sum += c;
				//add to c then store it as the sum
			}
			for (int c = first; c>=second; c--) 
			{
				sum += c;
				//subtract from c then store it as the sum
			}
			System.out.println("The sum of the numbers between " + first + " and " + second + " is " + sum);
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 3:
			int input;
			int sum2 = 0;
			int largestNumber;
			int smallestNumber;
			int userInput2 = 0;
			System.out.print("How many numbers will be entered?\n");
			input = inputReader.nextInt();
			if (input<=0)
			{
				largestNumber= 0;
				smallestNumber = 0;
				sum2 = 0;
			}
			else
			{
				System.out.print("Please enter the number 1: ");
				userInput2 = inputReader.nextInt();
				smallestNumber = userInput2;
				largestNumber = userInput2;
				sum2 += userInput2;
				for (int count = 2; count <= input; count++)
				{
					System.out.print("Please enter the number " + count + ": ");
					userInput2 = inputReader.nextInt();
					if (userInput2 > largestNumber)
					{
						largestNumber = userInput2;
					}
					if (userInput2 < smallestNumber)
					{
		
						smallestNumber = userInput2;
					}
					sum2 += userInput2;
				}
			}
			System.out.print("\n");
			System.out.print("\n");
			System.out.println("The largest number was " + largestNumber);
			System.out.println("The smallest number was " + smallestNumber);
			System.out.println("The sum of the numbers was " + sum2);
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 4:
			final int LENGTH = 5;
			final int HEIGHT = 9;
			for (int c =1; c<=HEIGHT; c++)
			{
				
				for (int leng =1; leng<=LENGTH; leng++)
				{
					System.out.print("X");
					
				}
				System.out.println();
			}
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 5: 
			final int HEIGHT_TRIANGLE = 4;
			for (int count2 = 1; count2<=HEIGHT_TRIANGLE; count2++)
			{
				for (int count3 =1; count3<= count2; count3++)
				{
					//loop the counter to increase the amount of x's on each loop
					System.out.print("X");
					
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 6:
System.out.println("\n\t1\t2\t3\t4\t5");
			
			for ( int lengthOfTable = 1; lengthOfTable <= 5; lengthOfTable++)
			{
				System.out.print(lengthOfTable);
				for ( int heightOfTable = 1; heightOfTable <= 5; heightOfTable++)
				{
					//must loop the length of variable not only print but to multiply
					System.out.print("\t" + (heightOfTable*lengthOfTable));
					
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 0:
			System.out.println("You have exited the menu.");

			break;
			
		default:
			System.out.println("Invalid option, Please try again!");
			System.out.print("\n");
			System.out.print("\n");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		inputReader.close();
	}
}
