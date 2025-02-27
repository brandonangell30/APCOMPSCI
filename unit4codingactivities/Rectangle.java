package unit4codingactivities;

public class Rectangle 
{
	private double length;
	private double width; 
	
	
	public Rectangle()
	{
		this (3,2);
	}
	
	public Rectangle(double l, double w)
	{
		setLength(l);
		setWidth(w);
	}

	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double w)
	{
		if (w<0)
		{
			width = 2.0;
		}
		else
		{
			width = w;
		}
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setLength(double l)
	{
		if (l<0)
		{
			length = 3.0;
		}
		else 
		{
			length = l;
		}
	}
	
	public String toString()
	{
		return "The rectangle has a length of " + length + " and a width of " + width;
	}
	
	public double returnArea ()
	{
		return (length * width);
	}
	
	public double returnPerimeter ()
	{
		return (length*2) + (width*2);
	}
	
	
	
	
	
}
