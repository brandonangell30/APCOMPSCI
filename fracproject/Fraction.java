package fractionproject;

/*
 * Name: Brandon Angell
 * Date: 3/1/2023
 * Purpose: To code several different tasks that involve fractions
 */

public class Fraction 
{
	private int num;
	private int denom;
	
	public Fraction()
	{
		//0 argument constructor
		num = 0;
		denom = 1;
	}
	
	public Fraction(int n, int d)
	{
		//2 argument constructor
		num = n;
		denom = d; 
		simplify();
	}
	
	public Fraction(double db)
	{
		//converts fraction into a decimal
		double eightdigit = 100000000;
		double t = db * eightdigit;
		num = (int)t;
		denom = (int)eightdigit;
		simplify();
	}
	
	
	
	//methods
	
	private void simplify()
	{
		//simplifies any fraction to its most simplest form 
		int gcf = 1; 
		//to check if the fraction is negative
		if (denom < 0)
		{
			num *=-1;
			denom *=-1;
		}
		//to simply the actual fraction
		for (int i = 1; i<= denom; i++)
		{
			if (num%i == 0 && denom%i ==0)
			{
				gcf = i;
			}
		}
		num /= gcf;
		denom /=gcf;
	}
	
	
	public Fraction add(Fraction f)
	{
		//adds two fractions together then simplifies to most simple term
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction add = new Fraction((num*d)+(n*denom), denom*d);
		add.simplify();
		return add;
	
	}

	public Fraction subtract(Fraction f)
	{
		//subtracts two fractions together then simplifies to most simple term
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction diff= new Fraction((num*d)-(n*denom), denom*d);
		diff.simplify();
		return diff;
		
	}
	public Fraction multiply(Fraction f)
	{
		//multiplies two fractions together then simplifies to most simple term
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction multi = new Fraction((num*n), denom*d);
		multi.simplify();
		return multi;
	}
	
	public Fraction divide(Fraction f)
	{
		//divides two fractions together then simplifies to most simple term
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction divide= new Fraction((num*d), denom*n);
		divide.simplify();
		return divide;
		
	}
	public double toDouble()
	{
		//getter method for the decimal form of a fraction
		return (double)num/denom;
		
	}

	public int getNumerator()
	{
		//getter method for the numerator
		return num;
	}
	
	public int getDenominator()
	{
		//getter method for the denominator
		return denom;
	}
	public int compareTo(Fraction f)
	{
		//compares the value of fractions, determines if equal
		if (f.toDouble()==(double)num/denom)
		{
			return 0;
		}
		else if(f.toDouble()<(double)num/denom) 
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	public boolean equals(Fraction f)
	{
		//compares the fraction to the decimal, sees if equal
		if((double)num/denom == f.toDouble())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean equals(double dd)
	{
		// if the decimal difference is less than or equal to .00000001 then they are set equal
		if ((Math.abs(dd-((double)num/denom)) <= 0.00000001))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean equals(int n, int d)
	{
		//compares two fractions to see if they are equal
		Fraction fraction1= new Fraction(num, denom);
		Fraction fraction2= new Fraction(n,d);
		if(fraction1.equals(fraction2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		//returns a string representing the fraction
			if (denom == 0) 
			{
				setNumerator(0);
				setDenominator(1);
				return "Error \n" + num + "/" + denom;
			} 
			else if(denom==0 && num==0) 
			{
			return "0";
			}
			else 
			{
			return num + "/" + denom;
			}
		}

	private void setDenominator(int sD) 
	{
		denom = sD;
	}

	public void setNumerator(int sN) 
	{
		num = sN;
		
	}

	
	
	
	}


