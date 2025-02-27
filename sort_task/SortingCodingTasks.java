package sortingcodingtasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingCodingTasks 
{
	//activity 1
	public static void sortArraySelection(int[] array)
	{
		for (int i = 0; i<array.length-1; i++)
		{
			int minIndex = i;
	        for (int j = i + 1; j < array.length; j++) 
	        {
	            if (array[minIndex] > array[j]) 
	            {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) 
	        {
	            int temp = array[i];
	            array[i] = array[minIndex];
	            array[minIndex] = temp;
	        }
		}
	}
	
	//activity 2 
	public static void sortArrayListSelection(ArrayList<String> arrList)
	{
		arrList = new ArrayList<String>();
		for (int i = 0; i < arrList.size(); i++) {
	        String smallest = arrList.get(i);
	        int smallestIndex = i;
	        for (int j = i; j < arrList.size(); j++) {
	            String value = arrList.get(j);
	            if (value.compareTo(smallest) < 0) {
	                smallest = value;
	                smallestIndex = j;
	            }
	        }
	        if (smallestIndex != i) {
	            String head = arrList.get(i);
	            arrList.set(i, smallest);
	            arrList.set(smallestIndex, head);
	        }
	    }
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int[] testArray = {4, 7, 9, 1, 3, 5, 0, 8};
		sortArraySelection(testArray);
		for (int i = 0; i<testArray.length; i++)
		{
			System.out.print(testArray[i]);
		}
		System.out.print("\n\n");
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("amazon");
		test.add("math");
		test.add("jacob");
		test.add("ben");
		test.add("sam");
		sortArrayListSelection(test);
		System.out.print(test);
	}
}
