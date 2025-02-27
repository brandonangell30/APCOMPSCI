package circleunit4;

public class CircleRunner 
{
	
	public static double compareRadii(Circle c1, Circle c2)
	{
		if (c1.getRadius()>= c2.getRadius())
		{
			return c1.getRadius();
		}
		else
		{
			return c2.getRadius();
		}
	}
	
	public static double compareAreas(Circle c1, Circle c2)
	{
		if (c1.returnArea()>= c2.returnArea())
		{
			return c1.returnArea();
		}
		else
		{
			return c2.returnArea();
		}
	}
	
	public static double compareCircumferences(Circle c1, Circle c2)
	{
		if (c1.returnCircumference()>= c2.returnCircumference())
		{
			return c1.returnCircumference();
		}
		else
		{
			return c2.returnCircumference();
		}
	}
	
	public static void main(String[] args) 
	{
		Circle circ1 = new Circle();
		Circle circ2 = new Circle(3.0);
		Circle circ3 = new Circle(-7.0);
		System.out.println(circ1.toString());
		System.out.println(circ2.toString());
		System.out.println("The larger radius of the two circles is: " + compareRadii(circ1, circ2));
		System.out.println("The larger area of the two circles is: " + compareAreas(circ1, circ2));
		System.out.println("The larger circumference of the two circles is: " + compareCircumferences(circ1, circ2));
		circ2.setRadius(10.0);
		System.out.println(circ2.toString());
		System.out.println("The larger radius of the two circles is: " + compareRadii(circ1, circ2));
		System.out.println("The larger area of the two circles is: " + compareAreas(circ1, circ2));
		System.out.println("The larger circumference of the two circles is: " + compareCircumferences(circ1, circ2));
		System.out.println(circ3.toString());
		
		
	}

}
