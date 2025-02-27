package searchingtasks;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;


public class SearchingTasks 
{

	//Activity 1
	public static int findNumLinear(int[] arr, int x)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if (arr[i] == x)
			{
				return i;
			}
		}
		return -1;
	
	}
	
	//Activity 2`
	public static String findByLetter(ArrayList<String> arr, String s1)
	{
		String attachment = "";
		System.out.println("The letter searched with is : " + s1);
		for(int i = 0; i<arr.size(); i++)
		{
			String word= arr.get(i).toLowerCase();
			if(word.substring(0,1).equals(s1))
			{
				attachment += " ";
				attachment += word;
			}
		}
		if (attachment == "")
		{
			return null;
		}
		else
		{
			return "The word found with that letter was: " + attachment;
		}
	}
	
	//Activity 3
	public static String findNumBinary(int[]array, int c)
	{
		Arrays.sort(array);
		System.out.print("Sorted Array: ");
		for (int i = 0; i<array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.print("\n\n");
		System.out.println("The number searched for is: " + c);
		int min = 0;
		int max = array.length-1;
		int midpoint= (min+max)/2;
		while(max>min)
		{
			if(array[midpoint]>c)
			{
				max = midpoint-1;
				midpoint=(max + min)/2;
				if(array[midpoint]==c)
				{
					return "The index the int was found at is: " + midpoint;
				}
			}
			else if(array[midpoint]<c)
			{
				min = midpoint+1;
				midpoint=(max + min)/2;
				if(array[midpoint] == c)
				{
					return "The index the int was found at is: " + midpoint;
				}
			}
			else if(array[midpoint] == c)
			{
				return "The index the int was found at is: " + midpoint;
			}
		}
		return "This was not found in the array:  " + -1;
	}
	
	public static String findWord(ArrayList<String> arrayS, String s)
	{
		Collections.sort(arrayS);
	    int min = 0;
	    int max = arrayS.size() - 1;
	    int midpoint;
	    while (min <= max)
	    {
	        midpoint = (max + min ) / 2;
	        if (s== arrayS.get(midpoint)) 
	        {
	            return "The index the string was found at is: " + midpoint;
	        } 
	        else if (s.compareTo(arrayS.get(midpoint)) < 0) 
	        {
	            max = midpoint - 1;
	        } 
	        else
	        {
	            min = midpoint + 1;
	        }
	    }

	    return "The string was not found: "  + -1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	
	{
//		//Activity 1 Print
//		int[] arr = {1,5,8,2,3,1,7};
//		System.out.print("Activity Array 1: ");
//		for (int i = 0; i<arr.length; i++)
//		{
//			System.out.print(arr[i] + ", ");
//		}
//		int o = 7;
//		int l = 11;
//		System.out.print("\n\n");
//		System.out.print("Number searched for: " + o + ". It is at index: ");
//		System.out.print(findNumLinear(arr, 7));
//		System.out.print("\n\n");
//		System.out.print("Number searched for: " + l + ". It is at index: ");
//		System.out.print(findNumLinear(arr, 11));
//		System.out.print("\n\n");
//		
//		
//		
//		//Activity 2 Print
//		ArrayList<String> stringArray = new ArrayList<String>();
//		stringArray.add("basketball");
//		stringArray.add("dinner");
//		stringArray.add("fun");
//		stringArray.add("Jacob");
//		System.out.println("The string array contains the words: " + stringArray);
//		System.out.println(findByLetter(stringArray, "j"));
//		System.out.print(findByLetter(stringArray, "g"));
//		System.out.print("\n\n");
//		
//		
//		
//		//Activity 3
//		System.out.print("Unsorted Array: ");
//		for (int i = 0; i<arr.length; i++)
//		{
//			System.out.print(arr[i] + ", ");
//		}
//		System.out.print("\n\n");
//		System.out.print(findNumBinary(arr, 1));
//		System.out.print("\n\n");
//		System.out.print(findNumBinary(arr, 4));
//		System.out.print("\n\n");
//		
//		//Activity 4
//		System.out.println("The string array contains the words: " + stringArray);
//		String word = "jacob";
//		System.out.print("The word searched for is: " + word);
//		System.out.print("\n\n");
//		System.out.print(findWord(stringArray, word));
//		System.out.print("\n\n");
//		word = "jack";
//		System.out.print("The word searched for is: " + word);
//		System.out.print("\n\n");
//		System.out.print(findWord(stringArray, word));
	
	}

}
