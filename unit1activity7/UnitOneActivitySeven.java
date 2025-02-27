package unitoneactivityseven;

/*
 * Name: Brandon Angell
 * Date: 9/12/2022
 * Purpose: To compute and calculate movie ratings based on critics, focus groups, and website ratings.
 */

import java.util.Scanner;

public class UnitOneActivitySeven 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		//Large Activity 7
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
		
		inputReader.close();

	}

}
