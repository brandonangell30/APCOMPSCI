package unitonesmallactivities;

/*
 * Name: Brandon Angell
 * Date: 9/7/2022
 * Purpose: To complete seven different small coding activities.
 */

import java.util.Scanner;

public class UnitOneSmallActivities 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		//Small Activity 1
		int userInt1, userInt2, userInt3, userInt4;
		System.out.print("Please enter 4 integers: ");
		userInt1 = inputReader.nextInt();
		userInt2 = inputReader.nextInt();
		userInt3 = inputReader.nextInt();
		userInt4 = inputReader.nextInt();
		System.out.println("The sum of your integers is " + (userInt1 + userInt2 + userInt3 + userInt4) + ".");
		double meanDouble;
		System.out.print("The mean of your integers is ");
		meanDouble = ((userInt1 + userInt2 + userInt3 + userInt4)/4.0);
		System.out.println("" + meanDouble + "." + "\n");
		
		//Small Activity 2
		System.out.println("What is the radius of the circle?");
		double circumferenceDouble;
		circumferenceDouble = inputReader.nextDouble();
		System.out.println("Circumference: " + (2*3.14*circumferenceDouble));
		double areaDouble;
		areaDouble = (circumferenceDouble*circumferenceDouble);
		System.out.println("Area: " + (3.14*areaDouble) + "\n");
		
		//Small Activity 3
		double doubleTruncate;
		System.out.print("Please input a decimal number: ");
		doubleTruncate = inputReader.nextDouble();
		System.out.println("Truncated Result: " + (int)(doubleTruncate) + "\n");
		
		//Small Activity 4
		double doubleModular;
		System.out.print("Please input a decimal number: ");
		doubleModular = inputReader.nextDouble();
		int doubleModularVar;
		doubleModularVar = (int)((doubleModular%1*100));
		System.out.println("The first two digits after the decimal point are: " + doubleModularVar + "\n");
		
		//Small Activity 5
		double doubleFahrenheit;
		System.out.print("Please enter a temperature in degrees Fahrenheit: ");
		doubleFahrenheit = inputReader.nextDouble();
		double doubleCelsius;
		doubleCelsius = (doubleFahrenheit - 32.0);
		System.out.println("That temperature in Celsius is " + (doubleCelsius*5.0/9.0) + ".");
		double doubleCelsius2;
		System.out.print("Please enter a temperature in degrees Celsius: ");
		doubleCelsius2 = inputReader.nextDouble();
		double doubleFahrenheit2;
		doubleFahrenheit2 = (doubleCelsius2*9.0/5.0);
		System.out.println("That temperature in Fahrenheit is " + (doubleFahrenheit2+32) + "." + "\n");
		
		//Small Activity 6
		double positiveIntegerD;
		System.out.print("Please enter a 3 digit positive integer: ");
		positiveIntegerD = inputReader.nextDouble();
		System.out.print("\n");
		int positiveInteger1;
		positiveInteger1 = (int)((positiveIntegerD/100%10));
		int positiveInteger2;
		positiveInteger2 = (int)((positiveIntegerD/10%10));
		int positiveInteger3;
		positiveInteger3 = (int)((positiveIntegerD%10));
		System.out.println("The digits are: " + "\n" + positiveInteger1 + "\n" + positiveInteger2 + "\n" + positiveInteger3);
		System.out.print("\n" + positiveInteger1 + " + " + positiveInteger2 + " + " + positiveInteger3 + " = " );
		System.out.print("" + (positiveInteger1 + positiveInteger2 + positiveInteger3));
		
		inputReader.close();
		
		
	}

}
