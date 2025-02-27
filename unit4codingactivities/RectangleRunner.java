package unit4codingactivities;

public class RectangleRunner 
{
	public static double compareLengths (Rectangle r1, Rectangle r2)
	{
		if (r1.getLength() >= r2.getLength())
		{
			return r1.getLength();
		}
		else
		{
			return r2.getLength();
		}
	}
	
	public static double compareAreas (Rectangle r11, Rectangle r22)
	{
		if (r11.returnArea() >= r22.returnArea())
		{
			return r11.returnArea();
		}
		else
		{
			return r22.returnArea();
		}
			
	}
	
	public static double comparePerimeters (Rectangle r111, Rectangle r222)
	{
		if (r111.returnPerimeter() >= r222.returnPerimeter())
		{
			return r111.returnPerimeter();
		}
		else
		{
			return r222.returnPerimeter();
		}
			
	}
	public static void main(String[] args) 
	{
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 9.5);
		Rectangle rect3 = new Rectangle(-7, -1);
		System.out.println(rect1);
		System.out.println(rect2);
		System.out.println("The larger length of the two rectangles is: " + compareLengths(rect1, rect2));
		System.out.println("The larger area of the two rectangles is: " +compareAreas(rect1, rect2));
		System.out.println("The larger perimeter of the two rectangles is: " +comparePerimeters(rect1, rect2));
		rect2.setLength(1);
		rect2.setWidth(.5);
		System.out.println(rect2.toString());
		System.out.println("The larger length of the two rectangles is: " +compareLengths(rect1, rect2));
		System.out.println("The larger area of the two rectangles is: " +compareAreas(rect1, rect2));
		System.out.println("The larger perimeter of the two rectangles is: " +comparePerimeters(rect1, rect2));
		System.out.println(rect3.toString());
	}

		
		
		
		
		
	}


