package switchhomework;

/*
 * Name: Brandon Angell
 * Date: 9/30/2022
 * Purpose: To create a menu in which the user can select a input and receive an output accordingly
 */
import java.util.Scanner;

public class SwitchHomework 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		System.out.println("Welcome to my animal kingdom sound domain! ");
		System.out.println("Please input the number coorelating to the animal sound you want to \"hear\" ");
		System.out.println("1 - Dog ");
		System.out.println("2 - Cat ");
		System.out.println("3 - Pig ");
		System.out.println("4 - Sheep ");
		System.out.println("5 - Birds ");
		int animalInput;
		System.out.print("Your selection: ");
		animalInput = inputReader.nextInt();
		switch(animalInput)
		{
		case 1:
			System.out.print("WOOF WOOF");
			break;
		case 2:
			System.out.print("MEOW MEOW");
			break;
		case 3:
			System.out.print("OINK OINK");
			break;
		case 4:
			System.out.print("BAA BAA");
			break;
		case 5:
			System.out.print("TWEET TWEET");
			break;
		default:
			System.out.print("That was not apart of my menu!!!");
			break;
		}	
			inputReader.close();
			
			
		
	}

}
