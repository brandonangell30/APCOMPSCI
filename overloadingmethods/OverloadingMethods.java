package overloadingmethods;

import java.util.Scanner;
import java.lang.Math;

public class OverloadingMethods 
{
	
	//find the mean
	public static double findMean (int a, int b, int c)
	{
		return (a+b+c)/3.0;
	}
	
	//find the mean with 4 int's
	public static double findMean (int a, int b, int c, int d)
	{
		return (a+b+c+d)/4.0;
	}
	
	//secondactm
	public static int changeNumOrNot (int one)
	{
		return Math.abs(one);
	}
	
	public static int changeNumOrNot (double two)
	{
		return (int)(two);
	}
	

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int w,x,y,z;
		System.out.print("Please enter the first integer: ");
		w = inputReader.nextInt();
		System.out.print("Please enter the second integer: ");
		x = inputReader.nextInt();
		System.out.print("Please enter the third integer: ");
		y = inputReader.nextInt();
		System.out.print("The mean of those three integers is: " + findMean(w,x,y));
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Please enter the fourth out of four integers: ");
		z = inputReader.nextInt();
		System.out.print("The mean of those four integers is: " + findMean(w,x,y,z));
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		int num1;
		System.out.print("Please enter an integer to take the absolute value of: ");
		num1 = inputReader.nextInt();
		System.out.print("Please enter an double you want a truncated value of: ");
		double num2 = inputReader.nextDouble();
		System.out.println("The absolute value of your integer is: " + changeNumOrNot(num1));
		System.out.println("The truncated absolute value of your integer is: " + changeNumOrNot(num2));
		
		inputReader.close();
	}
	
}


