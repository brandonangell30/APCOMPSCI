

public class TwoDArray 
{
//activity 1
	public static void printArray2D (int [][] printArray)
	{
		int count = 1;
		for (int i = 0; i<printArray.length; i++)
		{
			System.out.print("Student " + count + ": ");
			for (int j = 0; j<printArray[i].length; j++)
			{
				System.out.print(printArray[i][j] + " ");
			}
			System.out.print("\n");
			count++;
		}
	}
	//activity 2
	public static void printAverage(int [][] avgStudent)
	{
		int studentcount = 1;
		for (int i =0; i<avgStudent.length; i++)
		{
			double average = 0;
			for (int j=0; j<avgStudent[i].length; j++)
			{
				average += avgStudent[i][j];
			}
			average/=avgStudent[i].length;
			System.out.println("Student " + studentcount + " Average: " + average);
			studentcount++;
		}
	}
	
	//activity 4
	public static double[] testAvg(int[][] testA)
	{
		double[] tA = new double [testA[0].length];
		int arrayCount =0;
		for (int c=0; c< testA[0].length; c++)
		{
			double average1 = 0;
			for (int r=0; r<testA.length; r++)
			{
				average1 += testA[r][c];
			}
			average1/=testA.length;
			tA[arrayCount] = average1;
			arrayCount++;
		}
		return tA;
		
	}
	
	//activity 5
	public static boolean[] isImproving(int[][] improv)
	{
		boolean[] improvement = new boolean[improv.length];
		
		for (int r = 0; r<improv.length; r++)
		{
			boolean flag = true;
			for (int c = 1; c<improv[r].length; c++)
			{
				if (improv[r][c]>= improv [r][c-1])
				{
					
				}
				else
				{
					flag = false;
				}
				improvement[r] = flag;
			}
		}
		
		return improvement;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		//activity 1
		final int NUM_STUDENTS = 20;
		final int TEST_SCORES = 5;
		int [][] array2d = new int [NUM_STUDENTS][TEST_SCORES];
		for (int i = 0; i<array2d.length; i++)
		{
			for (int j = 0; j<array2d[i].length; j++)
			{
				array2d[i][j] = (int)(Math.random()*41)+60;
			}
		}
		
		//activity 2
		printArray2D(array2d);
		System.out.print("\n\n");
		
		//activity 3
		printAverage(array2d);
		System.out.print("\n\n");
		
		//activity 4
		double[] array1 = testAvg(array2d);
		int count1 = 1;
		for (int i=0; i<TEST_SCORES; i++)
		{
			System.out.println("Test " + count1 + " Average: " + array1[i]);
			count1++;
		}
		System.out.print("\n\n");
		
		//activity 5
		
		boolean [] activity5 = isImproving(array2d);
		int count11 = 0;
		for (int i = 0; i<NUM_STUDENTS; i++)
		{
			if (activity5[i]==false)
			{
				count11++;
			}
		}
		
		if (count11 == NUM_STUDENTS)
		{
			System.out.print("Unfortunately, there are no improving students." );
		}
		else
		{
			System.out.print("Improving Students: ");
			for (int i=0; i < NUM_STUDENTS; i++)
			{
				if (activity5[i]==true)
				{
					System.out.print((i + 1) + " ");
				}
			}
		}
		
	}

}
