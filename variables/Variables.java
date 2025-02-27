package variables;

/*
 * Name: Brandon Angell
 * Date: 8/30/2022
 * Purpose: Declare, initialize and print the values of variety a variables.
 */

public class Variables 
{

	public static void main(String[] args) 
	{
		int myInt = 5;
		System.out.println("The value of myInt is: " + myInt + ".");
		myInt = 8;
		System.out.println("The value of myInt is NOW: " + myInt + ".");
		double myDouble = 10.78;
		System.out.println("The value of myDouble is: " + myDouble);
		boolean myBoolean = true;
		System.out.println("Is my value of myDouble 10.78? " + myBoolean + ".");
		char myChar = 'a';
		System.out.println("The character of myChar is: " + myChar);
		String myString = "Hello World! This is my String";
		System.out.println("" + myString);
		int secondInt;
		secondInt = 20;
		System.out.println("The value of my secondInt is: " + secondInt + ".");
		double myDouble2 = 3.14, myDouble3 = 2.72;
		System.out.println("The value of myDouble2 and myDouble3 is: " + myDouble2 + " and " + myDouble3);
		
	}

}
