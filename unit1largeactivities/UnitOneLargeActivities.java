package unitonelargeactivities;

/*
 * Name: Brandon Angell
 * Date: 9/9/2022
 * Purpose: To complete two different large coding activities.
 */

import java.util.Scanner;

public class UnitOneLargeActivities 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		int ratingWebsites1, ratingWebsites2, ratingWebsites3;
		double focusGroups1, focusGroups2;
		double averageRating;
		System.out.print("Please enter three website ratings: ");
		ratingWebsites1 = inputReader.nextInt();
		ratingWebsites2 = inputReader.nextInt();
		ratingWebsites3 = inputReader.nextInt();
		System.out.print("\n");
		System.out.print("Please enter two ratings from focus groups: ");
		focusGroups1 = inputReader.nextDouble();
		focusGroups2 = inputReader.nextDouble();
		System.out.print("\n");
		System.out.print("Please enter the average movie critic rating: ");
		averageRating = inputReader.nextDouble();
		System.out.print("\n");
		double ratingWebsitesAverage;
		ratingWebsitesAverage = (double)(ratingWebsites1 + ratingWebsites2 + ratingWebsites3)/3;
		System.out.println("Average website rating: " + ratingWebsitesAverage);
		double focusGroupAverage;
		focusGroupAverage = (double)(focusGroups1 + focusGroups2)/2;
		System.out.println("Average focus group rating: " + focusGroupAverage);
		System.out.println("Average movie critic rating: " + averageRating);
		double overallR1;
		double overallR2;
		double overallR3;
		overallR1 = (double)(ratingWebsitesAverage)*.20;
		overallR2 = (double)(focusGroupAverage)*.30;
		overallR3 = (double)(averageRating)*.50;
		double totalAverage1;
		totalAverage1 = (overallR1 + overallR2 + overallR3);
		System.out.println("Overall movie rating: " + totalAverage1);
		System.out.print("\n");
		
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
		int dollars, quarters, dimes, nickels, pennies;
		dollars = (int)(changeDue);
		quarters = (int)((changeDue-dollars)/.25);
		dimes = (int)(((changeDue-dollars)%.25)/.10);
		nickels = (int)((((changeDue-dollars)%.25)%.10)/.05);
		pennies = (int)((((changeDue-dollars)%.25)%.15)/.01);
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
		
		//Large Activity 3
		double hoursWorked, hourlyRate;
		System.out.print("Enter the number of hours worked this week: ");
		hoursWorked = inputReader.nextDouble();
		System.out.print("Enter the hourly rate: ");
		hourlyRate = inputReader.nextDouble();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Hours worked:         " + hoursWorked);
		System.out.print("\nHourly rate:          " + hourlyRate);
		System.out.print("\n");
		System.out.print("\n");
		double grossPay, federalTax, socialSecurity, stateTax, localTax, netPay, allTax;
		grossPay = hoursWorked*hourlyRate;
		federalTax = grossPay*.18;
		socialSecurity = grossPay*.08;
		stateTax = grossPay*.032;
		localTax = grossPay*.02;
		allTax = (federalTax + socialSecurity + stateTax + localTax);
		netPay = grossPay-allTax;
		System.out.print("Gross pay:            $" + grossPay + "0");
		System.out.print("\nFederal tax (18%)     $" + federalTax + "0");
		System.out.print("\nSocial Security (8%)  $" + socialSecurity + "0");
		System.out.print("\nState tax (3.2%)      $" + stateTax + "0");
		System.out.print("\nLocal tax (2%)        $" + localTax + "0");
		System.out.print("\n\n\nNet pay               $" + netPay + "0");
		
		inputReader.close();
	}

}
