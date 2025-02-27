package unitoneactivitynine;

/*
 * Name: Brandon Angell
 * Date: 9/14/22
 * Purpose: To create a system that determines your next paycheck after taxes.
 */


import java.util.Scanner;

public class UnitOneActivityNine {

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		//Large Activity 3
				double hoursWorked, hourlyRate;
				System.out.print("Enter the number of hours worked this week: ");
				hoursWorked = inputReader.nextDouble();
				System.out.print("Enter the hourly rate: ");
				hourlyRate = inputReader.nextDouble();
				System.out.print("\n");
				System.out.print("\n");
				System.out.printf("Hours worked:         \t      %.2f", hoursWorked);
				System.out.printf("\nHourly rate:          \t      $%.2f", hourlyRate);
				System.out.print("\n");
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
				System.out.printf("Gross pay:            \t      $%.2f", grossPay);
				System.out.printf("\nFederal tax (18%%)     \t      $%.2f", federalTax);
				System.out.printf("\nSocial Security tax (8%%)      $%.2f", socialSecurity);
				System.out.printf("\nState tax (3.2%%)      \t      $%.2f", stateTax);
				System.out.printf("\nLocal tax (2%%)        \t      $%.2f", localTax);
				System.out.printf("\n\n\nNet pay               \t      $%.2f", netPay);
				
				inputReader.close();
	}

}
