package quadraticequation;

/*
 * Name: Brandon Angell 
 * Date: 9/16/2022
 * Purpose: To compute the quadratic formula with user inputs.
 */

import java.lang.Math;
import java.util.Scanner;


public class QuadraticEquation 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);

		System.out.println("Hello, today we are computing the quadratic formula.");
		System.out.println("The quadratic equation follows the format ax\u00b2+bx+c=0 \n");
		int a, b, c, exponent;
		System.out.print("Please insert one integer as the \"A\" value: ");
		a = inputReader.nextInt();
		System.out.print("\n");
		System.out.print("Please insert one integer as the \"B\" value: ");
		b = inputReader.nextInt();
		System.out.print("\n");
		System.out.print("Please insert one integer as the \"C\" value: ");
		c = inputReader.nextInt();
		System.out.print("\n");
		System.out.print("\n");
		exponent = 2;
		double quadPart1;
		double quadPart12;
		double quadPart13;
		double quadPart14;
		double quadBottom;
		double quadPositive;
		quadPart13 = ((4*a)*c);
		quadPart12 = (Math.pow(b,exponent)-quadPart13);
		quadPart14 = Math.sqrt(quadPart12);
		quadPart1 = (-b + quadPart14);
		quadBottom = (2.0*a);
		quadPositive = (quadPart1/quadBottom);
		double quadPart2;
		double quadNegative;
		quadPart2 = (-b - quadPart14);
		quadNegative = (quadPart2/quadBottom);
		System.out.print("The answers to your quadratic equation are: " + quadPositive + " and " + quadNegative);
		
		inputReader.close();
		
		
	}

}
