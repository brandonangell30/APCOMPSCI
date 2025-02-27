package testi;

public class Tesi 
{

	public static void main(String[] args) 
	{
		int value =9;
		int initValue = 1;
		value = initValue;
		if (value > 10)
			if (value > 15)
				value = 0;
			else
				value=1;
		System.out.println("value = " + value);
	}

}
