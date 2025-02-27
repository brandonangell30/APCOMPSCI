package unit3codingactivities;

import java.lang.Math;
import java.util.Scanner;

public class Unit3CodingActivities 
{
	//Activity 1
	public static double sendPerimeter(double w1, double l1)
	{
		return (l1 + l1 + w1+ w1);
	}
	
	//Activity 2
	public static void sendX(int x1)
	{
		int sum = x1;
		if (x1 >= 0)
		{
			while (x1 == sum && sum !=0 )
			{
			System.out.print("X ");
			sum--;
			x1--;
			}
		}
		else
		{
			System.out.print("We cannot do that!");
		}
	
	}
	
	//Activity 3
	
	public static double findDifference(double xf, double yf, double xs, double ys)
	{
		double first = (xs-xf);
		double second = (ys-yf);
		double next;
		double finalVal;
		first = Math.pow(first,2.0);
		second = Math.pow(second, 2.0);
		next = first + second;
		finalVal = Math.sqrt(next);
		return finalVal;
	}
	//Activity 4
	public static void findDivisors(int divisor)
	{
		System.out.print("The divisors of " + divisor + " are: ");
		for (int i =1; i<=divisor; i++)
		{
			if (divisor % i == 0)
			{
				System.out.print(i + " ");
			}
		}	
	}
	//Activity 5
	public static void makeTriangle(int x)
	{
		final int LENGTH = 9;
		for (int checkspace = LENGTH/2, counter = 1; counter <= LENGTH; checkspace--, counter+=2)
		{
			for (int space = 1; space <= checkspace; space++)
				{
				System.out.print(" ");
				}
					for (int a = 1; a <= counter; a++)
						{
						System.out.print("X");
						}
							for (int printX = 1; printX <= checkspace; printX++)
								{
								System.out.print(" ");
								}
			System.out.print("\n");
		}	
	}
	//Activity 6
	public static void findTime(int time)
	{
		if (time/3600 >= 1)
		{
			int hours = time/3600;
			int conversion = time - 3600;
			int minutes = conversion/60;
			int seconds = conversion % 60;
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println("Seconds: " + seconds);
		}
		else if (time/3600 < 1)
		{
			int hours = time/3600;
			int minutes = time/60;
			int seconds = time % 60;
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println("Seconds: " + seconds);
		}
		
	}

	//activity7
	public static void findSquareroot(int y)
	{
		int counter = 1;
		double x1;
		final double START = 500.0;
		double x = (1.0/2)*(START + y/START);
		x1 = 0;
		System.out.println("Approximation 1 of the square root of " + y + " is " + x);
		while ( Math.abs(x1 - x) > .001)
		{
			counter++;
			x1 = x;
			x = (1.0/2)*(x + y/x);
			System.out.println("Approximation " + counter + " of the square root of " + y + " is " + x);
		
		}
		System.out.printf("The square root of " + y + " is approximately %.3f", x);
		
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int userInput=1;
		while (userInput != 0)
		{
		System.out.println("Welcome to my activities buddy");
		System.out.println("Please choose one of my activities now!!!!!!!!!");
		System.out.println("1 - Rectangle Shenanigans ");
		System.out.println("2 - Print X's ");
		System.out.println("3 - Distance Between Two Points ");
		System.out.println("4 - All Divisors of User Input ");
		System.out.println("5 - X Triangle ");
		System.out.println("6 - Hours, Minutes, Seconds ");
		System.out.println("7 - Square Root Without Math.sqrt ");
		System.out.println("0 - Exit the Menu");
		System.out.print("Your selection: ");
		userInput = inputReader.nextInt();
		System.out.print("\n");
		
		switch (userInput)
		{
		case 1:
			double length, width;
			System.out.print("Please enter the length of your rectangle: ");
			length = inputReader.nextDouble();
			System.out.print("Please enter the width of your rectangle: ");
			width = inputReader.nextDouble();
			System.out.println("The perimeter of your rectangle is: " + sendPerimeter(length, width));
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 2:
			int x;
			System.out.print("Please enter the number of X's you want to print: ");
			x = inputReader.nextInt();
			sendX(x);
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 3:
			double coordX1, coordY1, coordX2, coordY2;
			System.out.println("I am following this format (X, Y) ");
			System.out.print("Please enter the first coordinate X point:  ");
			coordX1 = inputReader.nextDouble();
			System.out.print("Please enter the first coordinate Y point:  ");
			coordY1 = inputReader.nextDouble();
			System.out.print("Please enter the second coordinate X point: ");
			coordX2 = inputReader.nextDouble();
			System.out.print("Please enter the second coordinate Y point: ");
			coordY2 = inputReader.nextDouble();
			System.out.print("The distance between these two points is:   " + findDifference(coordX1, coordY1, coordX2, coordY2));
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 4:
			System.out.print("Please enter a positive integer: ");
			int posInt = inputReader.nextInt();
			findDivisors(posInt);
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			break;
			
		case 5: 
			int r = 9;
			makeTriangle(r);
			System.out.print("\n");
			break;
			
		case 6:
			System.out.print("Please enter the number of seconds: ");
			int seconds = inputReader.nextInt();
			findTime(seconds);
			break;
			
		case 7:
			System.out.print("Please enter a number you would like to compute the square root of: ");
			int input = inputReader.nextInt();
			findSquareroot(input);
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
