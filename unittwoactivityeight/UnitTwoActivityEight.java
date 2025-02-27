package unittwoactivityeight;

/*
 * Name: Brandon Angell
 * Date: 10/05/2022
 * Purpose: To determine the total price of the gallons and or car wash depending on what the user selects.
 */

import java.util.Scanner;

public class UnitTwoActivityEight 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		char gas, carWash;
		double gallons, totGasCost, totalDue, regularGas, premiumGas, superGas;
		regularGas = 3.599;
		premiumGas = 3.799;
		superGas = 3.699;
		System.out.print("Enter gas type (R, S, P, or N): ");
		gas = inputReader.next().charAt(0);
		System.out.print("Enter number of gallons: ");
		gallons = inputReader.nextDouble();
		System.out.print("Enter Y or N for car wash: ");
		carWash = inputReader.next().charAt(0);
		
		//if the costumer buys gas over 2.63 gallons and if they receive a car wash
		//2.63 is used to see if they get a discounted car wash because its basically 10 dollars for R
		if ((gas=='R' && gallons>=2.77855 && carWash=='Y') || (gas=='S' && gallons>=2.7035 && carWash=='Y') || (gas=='P' && gallons>=2.6323 && carWash=='Y'))
		{
			switch (gas)
			{
			case ('R'):
			totGasCost = regularGas*gallons;
			System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
			System.out.print("\nPrice per gallon:\t\t\t$" + regularGas);
			System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
			System.out.print("\nCar wash cost:\t\t\t\t$3.00");
			totalDue = totGasCost + 3.00;
			System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
			break;
			
			case ('S'):
			totGasCost = superGas*gallons;
			System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
			System.out.print("\nPrice per gallon:\t\t\t$" + superGas);
			System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
			System.out.print("\nCar wash cost:\t\t\t\t$3.00");
			totalDue = totGasCost + 3.00;
			System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
			break;
			
			case ('P'):
			totGasCost = premiumGas*gallons;
			System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
			System.out.print("\nPrice per gallon:\t\t\t$" + premiumGas);
			System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
			System.out.print("\nCar wash cost:\t\t\t\t$3.00");
			totalDue = totGasCost + 3.00;
			System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
			break;
			
			}
			
		}
		
		//if the user purchases gas, but under 2.63 gallons and receives a car wash
		
		else if ((gas=='R' && carWash=='Y' && gallons<2.77855) || (gas=='S'  && carWash=='Y' && gallons<2.7035) || (gas=='P' && gallons<2.6323 && carWash=='Y'))
		{
			switch (gas)
			{
			case ('R'):
				totGasCost = regularGas*gallons;
				System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
				System.out.print("\nPrice per gallon:\t\t\t$" + regularGas);
				System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
				System.out.print("\nCar wash cost:\t\t\t\t$5.00");
				totalDue = totGasCost + 5.00;
				System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
				break;
				
				case ('S'):
				totGasCost = superGas*gallons;
				System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
				System.out.print("\nPrice per gallon:\t\t\t$" + superGas);
				System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
				System.out.print("\nCar wash cost:\t\t\t\t$5.00");
				totalDue = totGasCost + 5.00;
				System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
				break;
				
				case ('P'):
				totGasCost = premiumGas*gallons;
				System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
				System.out.print("\nPrice per gallon:\t\t\t$" + premiumGas);
				System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
				System.out.print("\nCar wash cost:\t\t\t\t$5.00");
				totalDue = totGasCost + 5.00;
				System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
				break;
			}
		}
		
		// if the user buys gas with no car wash
		
		else if ((gas=='R' && carWash=='N') || (gas=='S' && carWash=='N') || (gas=='P' && carWash=='N'))
		{
			switch (gas)
			{
			case ('R'):
				totGasCost = regularGas*gallons;
				System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
				System.out.print("\nPrice per gallon:\t\t\t$" + regularGas);
				System.out.printf("\nTotal gasoline cost:\t\t\t%.2f",totGasCost);
				System.out.print("\nCar wash cost:\t\t\t\t$0.00");
				totalDue = totGasCost;
				System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
				break;
				
				case ('S'):
				totGasCost = superGas*gallons;
				System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
				System.out.print("\nPrice per gallon:\t\t\t$" + superGas);
				System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
				System.out.print("\nCar wash cost:\t\t\t\t$0.00");
				totalDue = totGasCost;
				System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
				break;
				
				case ('P'):
				totGasCost = premiumGas*gallons;
				System.out.print("Amount of gas purhcased:\t\t" + gallons + " gallons");
				System.out.print("\nPrice per gallon:\t\t\t$" + premiumGas);
				System.out.printf("\nTotal gasoline cost:\t\t\t$%.2f",totGasCost);
				System.out.print("\nCar wash cost:\t\t\t\t$0.00");
				totalDue = totGasCost;
				System.out.printf("\nTotal Due:\t\t\t\t$%.2f", totalDue);
				break;
			}
		}
		//if the user only gets a car wash with no purchase of gas
		else if (gas=='N' && carWash=='Y')	
		{
			System.out.print("Amount of gas purhcased:\t\t0 gallons");
			System.out.print("\nPrice per gallon:\t\t\t$0.00");
			System.out.print("\nTotal gasoline cost:\t\t\t$0.00");
			System.out.print("\nCar wash cost:\t\t\t\t$5.00");
			System.out.print("\nTotal Due:\t\t\t\t$5.00");
		}
		//if the user does not purchase gas or a car wash
		else if (gas=='N' && carWash=='N')
		{
			System.out.print("Amount of gas purhcased:\t\t0 gallons");
			System.out.print("\nPrice per gallon:\t\t\t$0.00");
			System.out.print("\nTotal gasoline cost:\t\t\t$0.00");
			System.out.print("\nCar wash cost:\t\t\t\t$0.00");
			System.out.print("\nTotal Due:\t\t\t\t$0.00");
		}
		System.out.print("\n\nTHANK YOU FOR COMING!");
		inputReader.close();
		
		
		
		

	}

}
