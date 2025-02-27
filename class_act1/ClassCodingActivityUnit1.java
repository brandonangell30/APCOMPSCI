package classcodingactivityunit1;

import java.util.Scanner;

import java.lang.Math;

public class ClassCodingActivityUnit1 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		int x, y;
		System.out.print("Please input two positive integers. Y should be Greater than X: ");
		x = inputReader.nextInt();
		y = inputReader.nextInt();
		System.out.print("\n");
		System.out.println("The absolute value of your integers is: " + Math.abs(x-y));
		System.out.print("\n");
		System.out.println("The x to the y power is: "  + Math.pow(x,y));
		System.out.print("\n");
		System.out.println("The square root of x is: " + Math.sqrt(x));
		System.out.print("\n");
		
		//Random int that simulates dice roll
		System.out.print("Its time to roll the dice!");
		System.out.print("\n");
		int dice;
		dice = (int)(Math.random() * (7-1) + 1);
		System.out.printf("Your dice roll is....... " + dice);
		
		
		inputReader.close();
		
		
		
		
		
	}

}
