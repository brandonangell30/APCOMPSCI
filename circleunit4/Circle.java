package circleunit4;

public class Circle 
{
	private double radius;
	
	public Circle()
	{
		this (5.0);
	}

	public Circle(double r) 
	{
		setRadius(r);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		if (r<0)
		{
			radius = 5.0;
		}
		else 
		{
			radius = r;
		}
	}
	
	public String toString()
	{
		return "The circle has a radius of " + radius;
	}
	
	public double returnArea()
	{
		return (radius*radius) * Math.PI;
	}
	
	public double returnCircumference()
	{
		return (2 * Math.PI * radius);
	}
}
