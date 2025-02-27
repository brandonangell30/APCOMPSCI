package ultimatefrissbeeproject;

public class UltimatePlayer extends Person 
{
	private static int jerseyNumber;
	private int jN;
	private String position;
	

	public UltimatePlayer(String f, String l, String p) 
	{
		super(f, l);
		setPosition(p);
		jerseyNumber++;
		jN = jerseyNumber;
	}

	
	
	
	public String getPosition()
	{
		return position;
	}
	
	public void setPosition(String p)
	{
		p = p.toLowerCase();
		if (p.equals("handler"))
		{
			position = "handler";
		}
		else if (p.equals("cutter"))
		{
			position = "cutter";
		}
		else
		{
			position = "handler";
		}
	}
	
	public String toString()
	{
		return super.toString() + "\n\tJersey #: " + jN + "\n\tPosition: " + position;
	}
	
}
