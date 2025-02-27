package unit2act6;

/*
 * Name: Brandon Angell
 * Date: 10/03/2022
 * Purpose: To create a box and test a point within it.
 */
import java.util.Scanner;

public class Unit2Act6 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		//user coordinates
		int xInput;
		int yInput;
		int height;
		int length;
		//box dimensions
		int xCoordinate;
		int yCoordinate;
		int xLength;
		int yHeight;
		//test point
		System.out.print("Enter the x coordinate of the bottom left corner of the box: ");
		xInput = inputReader.nextInt();
		System.out.print("Enter the y coordinate of the bottom left corner of the box: ");
		yInput = inputReader.nextInt();
		System.out.print("Enter the height of the box: ");
		height = inputReader.nextInt();
		System.out.print("Enter the length of the box: ");
		length = inputReader.nextInt();
		System.out.print("Enter the x coordinate of the point: ");
		xCoordinate = inputReader.nextInt();
		System.out.print("Enter the y coordinate of the point: ");
		yCoordinate = inputReader.nextInt();
		xLength = xInput + length;
		yHeight = yInput + height;
		if (xCoordinate>=xInput && xCoordinate<=xLength && yCoordinate<=yHeight && yCoordinate>=yInput)
		{
			System.out.print("The point (" + xCoordinate + "," + yCoordinate + ") is inside the box.");
		}
		else 
		{
			System.out.print("The point (" + xCoordinate + "," + yCoordinate +") is not inside the box.");
		}
		inputReader.close();
		

	}

}
