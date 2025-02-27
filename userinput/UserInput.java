package userinput;

/* 
 * Name: Brandon Angell
 * Date: 8/31/2022
 * Purpose: To read user input and print it out.
 */

import java.util.Scanner;

public class UserInput 
{

	public static void main(String[] args)
	{
		Scanner inputReader = new Scanner(System.in);

		
		String whatsYourName;
		System.out.println("What is your name?");
		whatsYourName = inputReader.nextLine();
		
		
		int favoriteInteger;
		System.out.println("What is your favorite integer?");
		favoriteInteger = inputReader.nextInt();
		System.out.println( "" + whatsYourName + "'s favorite integer is: " + favoriteInteger);
		
		inputReader.close();
	}

}
