package unitoneactivityeight;

/*
 * Name: Brandon Angell
 * Date: 9/20/22
 * Purpose: To imitate a cash register by giving back change after the user inputs their values.
 */

import java.util.Scanner;

public class UnitOneActivityEight 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		//Large Activity 2 
			double purchasePrice, amountRecieved;
			System.out.print("Enter purchase price:     ");
			purchasePrice = inputReader.nextDouble();
			System.out.print("\n");
			System.out.print("Enter amount recieved:    ");
			amountRecieved = inputReader.nextDouble();
			System.out.print("\n");
			double changeDue;
			changeDue = (amountRecieved - purchasePrice);
			System.out.println("Change Due:               " + changeDue);
			System.out.print("\n");
			System.out.print("\n");
			int dollars, quarters, dimes, nickels, pennies, doubleModularVar;
			doubleModularVar = (int)(((changeDue%1*100)+.5));
			dollars = (int)(changeDue);
			quarters = (int)((doubleModularVar)/25);
			dimes = (int)(((doubleModularVar)%25)/10);
			nickels = (int)((((doubleModularVar)%25)%10)/5);
			pennies = (int)(((((doubleModularVar)%25)%10)%5)/1);
			System.out.println("Dollars:     " + dollars);
			System.out.print("\n");
			System.out.println("Quarters:    " + quarters);
			System.out.print("\n");
			System.out.println("Dimes:       " + dimes);
			System.out.print("\n");
			System.out.println("Nickels:     " + nickels);
			System.out.print("\n");
			System.out.println("Pennies:     " + pennies);
			System.out.print("\n");
			System.out.print("\n");
				
			inputReader.close();
			
	}

}
