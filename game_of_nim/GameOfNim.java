package gameofnim;

import java.util.Scanner;

public class GameOfNim 
{
	public static int findFact(int num1)
	{
		 
		System.out.print(num1);
		int dummy = num1;
			for (int i = num1; i>1; i-- )
			{
				dummy *= (i-1);
				num1 = dummy;
			}
			return num1;
	 }
			
	public static void findNum(int x)
	{
		int y = 5;
		if (x<5)
		{
			System.out.print("L");
		}
		else
		{
			while (y<=x)
			{
				System.out.print(" " + y + " ");
				y+=5;
			}
		}
	}
	
	
	
	
	public static int findURMOM(int num1)
	{
		if (num1 == 1)
		{
			return num1;
		}
		else
		{
			return num1*findURMOM(num1-1);
		}
	}
	
	
	
	public static int itFibs(int w)
	{	
		int sum = 0;
		int a = 0;
		int b = 1;
		for (int i = 1; i<=(w-2); i++)
		{
			
			sum = a+b;
			a=b;
			b=sum;
			
			
			
		}
		return sum;
		
	}
	
	
	
	public static int recursFibs(int w)
	{
		if (w==1)
		{
			return 0;
		}
		else if (w==2)
		{
			return 1;
		}
		else 
		{
			return recursFibs(w-1) + recursFibs(w-2);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int o;
		System.out.print("Pwease enta a pos int!!!: " );
		o = inputReader.nextInt();
		findNum(o);
		
//		System.out.print("Pwease enta a pos int for recurs duh!!!: " );
//		x = inputReader.nextInt();
//		System.out.println(x + "! = " + findURMOM(x));
//		
//		
//		int o;
//		System.out.print("Pwease enta a pos int term for fibonacci!!!: " );
//		o = inputReader.nextInt();
//		System.out.println("Term " + o + " in the Fibonacci sequence is: " + itFibs(o));
//		
//		
//		System.out.print("Pwease enta a pos int term for recurs fibonacci!!!: " );
//		o = inputReader.nextInt();
//		System.out.println("Term " + o + " in the Fibonacci sequence is: " + recursFibs(o));
		
		inputReader.close();
	}

}
