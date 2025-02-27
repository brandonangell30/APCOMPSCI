package userinput;

/*
 * Name: Brandon Angell
 * Date: 8/31/2022
 * Purpose: To print doubles, ask the user their name, 
 * and to inform the user how many years until they are 100.
 */

import java.util.Scanner;

public class UserImputHW 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		double userDouble1, userDouble2;
		System.out.println("Please imput two doubles: ");
		userDouble1 = inputReader.nextDouble();
		userDouble2 = inputReader.nextDouble();
		System.out.println("Your doubles were " + userDouble2 + " and " + userDouble1 + "\n");
		
		String whatIsYourName;
		System.out.println("What is your name?");
		inputReader.nextLine();
		whatIsYourName = inputReader.nextLine();
		System.out.println("Hi " + whatIsYourName + ".  How old are you?");
		
		int user100 = 100;
		int userAge;
		userAge = inputReader.nextInt();
		System.out.print( whatIsYourName + ", in ");
		System.out.print(user100 - userAge + " years you will be 100.");
		
		inputReader.close();
		
	}

}
