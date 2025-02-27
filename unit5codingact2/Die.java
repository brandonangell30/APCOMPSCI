package unit5codingactivites2;

/*
 * Name: Brandon Angell
 * Date: 12/7/22
 * Purpose: To build a blueprint for dice.
 */

public class Die 
{
	//fields
	private int numSides;
	private int currentValue;
	
	//no argument constructor that calls the one argument constructor.
	public Die()
	{
		this (6);
	}
	
	//one argument constructor that also calls the mutator setNumSides.
	public Die(int d) 
	{
		setNumSides(d);
		roll();
	}
	
	//Accessor method.
	public int getNumSides()
	{
		return numSides;
	}
	
	//Mutator method. 
	public void setNumSides(int d) 
	{
		if (d < 3)
		{
			System.out.println("You cannot create a dice with "+ d + " sides! A die with 6 sides is being created instead.");
			numSides = 6;
		}
		else
		{
			numSides = d;
		}
	}

	//Accessor method.
	public int getCurrentValue()
	{
		return currentValue;
	}
	
	//Mutator method.
	public void setCurrentValue(int cV)
	{
		if (cV < 1 || cV > numSides)
		{
			System.out.println("You cannot set the value of the die to " + cV + ". You must set the die to a value between 1 and 6. The die has been rolled instead.");
			roll();
		}
		else
		{
			currentValue = cV;
		}
		
	}
	
	//computes a random number for the current value. 
	public int roll()
	{
		return currentValue = (int)((Math.random()*numSides)+1);
	}
	
	//toString method.
	public String toString()
	{
		return "The die has " + numSides + " sides and its current value is " + currentValue + ".";
	}
	
	
	
	
	
	
	
}
