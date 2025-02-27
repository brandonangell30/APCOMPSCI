package unit5codingactivites2;

/*
 * Name: Brandon Angell
 * Date: 1/19/2023
 * Purpose: To code 4 various small activities.
 */



import java.util.Scanner;

import java.util.Arrays;

import java.lang.Math;

public class Unit5CodingActivities2 
{
	
public static int findRelativeNum(int first, int second)
{
    int complete = second;
    if(second >= first)
    {
        return (complete + 1);
    }
    else
    {
        return complete;
    }
}
public static int findMaxIndex(int [] arr)
{
    int max=arr[0];
    int maxIndex = 0;

    for(int i = 0; i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max = arr[i];
            maxIndex = i;
        }
    }
    return maxIndex;
}

public static int[] delete(int [] arr, int skip)
{
    int arr2 = arr.length-1;
    int j = 0;
    int[] arr3 = new int[arr2];
    boolean flag = false;

    for(int i = 0; i<arr2; i++)
    {
        if(flag || i != skip)
        {
            arr3[i] = arr[j];
            j++;
        }
        else
        {
            j++;
            i--;
            flag = true; 
        }

    }
    return arr3;
}

	public static int findSingleDigits(int[] arr3)
	{
		int count=0;
		for (int i = 0; i<20; i++)
		{
			if (arr3[i] <10)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int selection;
		do
		{
			System.out.println("Welcome to the Unit 5 Coding Activities Menu!");
			System.out.println("Activity 1: Is the first letter in a char/string is a vowel");
			System.out.println("Activity 2: How many single diget elements are in the array");
			System.out.println("Activity 3: Rolls Dice");
			System.out.println("Activity 4: Finds the maximum, minimum and mean of the array.");
			System.out.println("Activity 5: Takes 3 integers and sorts them by index. ");
			System.out.println("Activity 0: Exit the menu. ");
			System.out.print("Your choice: ");
			System.out.println("\n\n");
			selection = inputReader.nextInt();
			switch (selection)
			{
			
			case 1:
				System.out.print("Please enter a character: ");
				String s1 = inputReader.next();
				String[] arr = {"a", "e", "i", "o", "u"};
				s1= s1.toLowerCase();
				if (s1.indexOf(s1.charAt(0)) == 0 && s1.indexOf(arr[0]) == 0 || s1.indexOf(s1.charAt(0)) == 0 && s1.indexOf(arr[1]) == 0 || s1.indexOf(s1.charAt(0)) == 0 && s1.indexOf(arr[2]) == 0) 
				{
					System.out.println(s1.substring(0,1) + " is a vowel!");
				}
				else if (s1.indexOf(s1.charAt(0)) == 0 && s1.indexOf(arr[3]) == 0 || s1.indexOf(s1.charAt(0)) == 0 && s1.indexOf(arr[4]) == 0)
				{
					System.out.println(s1.substring(0,1) + " is a vowel!");
				}
				else
				{
					System.out.println(s1.substring(0,1) + " is not a vowel.");
				}
				System.out.println("\n\n");
				break;
				
				
			case 2:
				int[] arr2 = new int[20]; 
				for (int i = 0; i<20; i++)
				{
					arr2[i] = (int)(Math.random()*50)+1;
				}
				System.out.print(Arrays.toString(arr2));
				System.out.println("\nThere are " +findSingleDigits(arr2) + " single digit values in the array.");
				System.out.println("\n\n");
				break;

			case 3:
				Die d4 = new Die(4); 
				Die d6 = new Die(6);
				Die d8 = new Die(8);
				Die d10 = new Die(10);
				Die d12 = new Die(12);
				Die d20 = new Die(20);
				Die[]darray = {d4, d6, d8, d10, d12, d20};
				int b = 0;
				System.out.print("The dice rolled: ");
				for(Die x : darray)
				{
					b = x.roll();
					System.out.print(b + " ");
				}
				System.out.println();
				System.out.println();
				System.out.println();
				break;
				
			case 4:
				int[] array = new int[5];
				System.out.println("You will need to enter 5 integers.");
				System.out.print("Please enter integer 1: ");
				array[0] = inputReader.nextInt();
				System.out.print("Please enter integer 2: ");
				array[1] = inputReader.nextInt();
				System.out.print("Please enter integer 3: ");
				array[2] = inputReader.nextInt();
				System.out.print("Please enter integer 4: ");
				array[3] = inputReader.nextInt();
				System.out.print("Please enter integer 5: ");
				array[4] = inputReader.nextInt();
				int minimum = array[0];
				int maximum = array[0];
				double mean = 0;
				for (int i=0; i< array.length; i++)
				{
					if (array[i]< minimum)
					{
						minimum = array[i];
					}
					if (array[i]>maximum)
					{
						maximum = array[i];
					}
					mean+=array[i];
				}
				
				System.out.println("Maximum: " + maximum);
				System.out.println("Minimum: " + minimum);
				System.out.println("Mean " + ((double)mean)/array.length);	
				System.out.println();
				System.out.println();
				System.out.println();
				break;
				
			case 5:
				System.out.print("Please input the number of integers you would like to enter: ");
		        int userInput = inputReader.nextInt();

		        if(userInput<3)
		        {
		            while(userInput<3)
		            {
		            System.out.print("Please enter a number that is 3 or larger.\n");
		            System.out.print("Please input the number of integers you would like to enter: ");
		            userInput = inputReader.nextInt();
		            }
		        }
		        int[] array1 = new int[userInput];
		        for(int i = 0; i<userInput; i++)
		        {
		            System.out.print("Please enter integer " + (i+1) + ": ");
		            int arrInput = inputReader.nextInt();
		            array1[i] = arrInput;
		        }
		        
		        int largestIndex = findMaxIndex(array1);
		        int[] array2 = delete(array1, largestIndex);
		        int secondLargestIndex = findMaxIndex(array2);
		        int[] array3 = delete(array2, secondLargestIndex);
		        int thirdLargestIndex = findMaxIndex(array3);
		        int findLargestIndex = largestIndex;
		        int findSecondLargestIndex = findRelativeNum(findLargestIndex, secondLargestIndex);
		        int findThirdLargestIndex = findRelativeNum(secondLargestIndex, thirdLargestIndex);
		        if(findSecondLargestIndex > secondLargestIndex)
		        {
		            findThirdLargestIndex++;
		        }

		        System.out.println("The largest number entered was " + array1[largestIndex] + " at index " + findLargestIndex + ".");
		        System.out.println("The second largest number entered was " + array2[secondLargestIndex] + " at index " + findSecondLargestIndex + ".");
		        System.out.println("The third largest number entered was " + array3[thirdLargestIndex] + " at index " + findThirdLargestIndex + ".");
		        System.out.println("\n\n");
		        System.out.println("\n\n");
				
				}
			
			if ((selection <= 0) || (selection >= 6))
			{			
				System.out.print("Please enter a valid option, please enter an activity number to enter back into the menu. ");
				selection = inputReader.nextInt();
			}
		}
		while (selection>=0 && selection<=5);
		inputReader.close();
}
	
	
}
