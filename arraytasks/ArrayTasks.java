package arraytasks;
/*
 * Name: Brandon Angell
 * Date: 1/17/23
 * Purpose: To complete various tasks involving arrays.
 */

public class ArrayTasks 
{

	public static void main(String[] args) 
	{
//		//activity 1
//		int [] array1 = new int [30];
//		
//		for (int i = 0; i<30; i++)
//		{
//			array1[i] = (int)(Math.random()*21)+-10;
//		}
//		
//		//activity 2
//		System.out.print("\n\n");
//		System.out.print("[");
//		System.out.print(array1[0]);
//		for (int i = 1; i<30; i++)
//		{
//			System.out.print(", " + array1[i]);
//		}
//		System.out.print("]");
//		
//		//activity 3/4
//		int[] array2 = new int [array1.length];
//		array2[0] = 100;
//		
//		System.out.print("\n\n");
//		
//		System.out.print("ARRAY 1: [");
//		System.out.print(array1[0]);
//		for (int i = 1; i<30; i++)
//		{
//			System.out.print(", " + array1[i]);
//		}
//		System.out.print("]");
//		
//		System.out.print("\n\n");
//		System.out.print("ARRAY 2: [");
//		System.out.print(array2[0]);
//		for (int i = 1; i<30; i++)
//		{
//			array2[i] = (int)(Math.random()*21)+-10;
//			System.out.print(", " + array2[i]);
//		}
//		System.out.print("]");
//		
//		//activity 5
//		int sum = 0;
//		for (int i = 0; i<array1.length; i++)
//		{
//			sum += array1[i];	
//		}
//		
//		System.out.print("\n\n");
//		System.out.println("The sum of array 1 is " + sum);
//		System.out.print("\n");
//		linearSearch(array1, -10);		
//	}
//	
//	//method for activity 6
//	public static void linearSearch(int [] arr, int num)
//	{
//		boolean searchFound = false;
//		for (int j = 0; j<arr.length; j++)
//		{
//			if (arr[j] == num)
//			{
//				System.out.print(num + " was found in the array at index " + j);
//				searchFound = true;
//				break;
//			}
//		}
//		if (searchFound == false)
//		{
//			System.out.print(num + " was not found in the array.");
//		}
//		
//		
		
		String[] arrayStrings = new String [4];
		arrayStrings[0] = "Luke";
		arrayStrings[1] = "Han";
		arrayStrings[2] = "Leia";
		arrayStrings[3] = "Lando";
		
		
		
		for (String a : arrayStrings)
		{
			System.out.print(a.length() + "\t");
			System.out.print(a.toUpperCase() + "\t");
			System.out.print(a.charAt(0) + "\t");
			System.out.print(a.charAt(a.length()-1) + "\t");
			System.out.print("\n");
		}
		
		System.out.print("\n\n\n\n");
		for (int i = 0; i< arrayStrings.length; i++)
		{
			System.out.print(arrayStrings[i].length() + "\t");
			System.out.print(arrayStrings[i].toUpperCase() + "\t");
			System.out.print(arrayStrings[i].charAt(0) + "\t");
			System.out.print(arrayStrings[i].charAt(arrayStrings[i].length()-1) + "\t");
			System.out.print("\n");
		}
		
		
		
		}	
		
		
		
	}

		
		


