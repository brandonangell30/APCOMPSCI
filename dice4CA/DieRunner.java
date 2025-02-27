package diceUnit4CA;

/*
 * Name: Brandon Angell
 * Date: 12/7/22
 * Purpose: To build a blueprint for dice.
 */


public class DieRunner 
{
	
	//Rolls two dice, and lets the user know what dice rolled a larger value.
	public static void rollOff(Die d1, Die d2)
	{
		d1.roll();
		d2.roll();
		System.out.println("The first die rolled a " + d1.getCurrentValue());
		System.out.println("The second die rolled a " + d2.getCurrentValue());
		
		if (d1.getCurrentValue() > d2.getCurrentValue())
		{
			System.out.println(d1.getCurrentValue() + " is larger, so die 1 wins the roll-off!");
		}
		else if (d1.getCurrentValue() == d2.getCurrentValue())
		{
			System.out.println(d1.getCurrentValue() + " is equal to die 2, so neither die wins the roll-off!");
		}
		else
		{
			System.out.println(d2.getCurrentValue() + " is larger, so die 2 wins the roll-off!");
		}
		
	}
	//Compares the two dice and returns the larger number of sides.
	public static int compareSides(Die d1, Die d2)
	{
		if (d1.getNumSides() >= d2.getNumSides())
		{
			return d1.getNumSides();
		}
		else
		{
			return d2.getNumSides();
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Die d6 = new Die();
		Die d20 = new Die(20);
		System.out.println(d6.toString());
		System.out.println(d20.toString());
		rollOff(d6, d20);
		System.out.println("The larger number of sides of the two dice is: " + compareSides(d6, d20));
		
		//rolls dice 30 times and prints "critical hit" when landing on 20.
		for (int i = 1; i<=30; i++)
		{
			d20.roll();
			System.out.print(d20.getCurrentValue() + " ");
			if (d20.getCurrentValue() == 20)
			{
				System.out.print("Critical Hit! ");
			}
		}
		System.out.println();
		d6.setCurrentValue(5);
		System.out.println(d6.toString());
		Die d2 = new Die(2);
		System.out.println(d2.toString());
		d2.setCurrentValue(8);
		System.out.println(d2.toString());
		
	}

}
