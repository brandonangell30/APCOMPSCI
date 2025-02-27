package ultimatefrissbeeproject;

public class Captain extends UltimatePlayer 
{
	private boolean type;
	private String captainType;
	
	public Captain (String f, String l, String p, boolean t)
	{
		super(f,l,p);
		type = t;
		setCaptainType(t);
	}
	
	
	public void setCaptainType(boolean t1)
	{
		if (type == true)
		{
			captainType = "offense";
		}
		else
		{
			captainType = "defense";
		}
	}
	
	public String toString()
	{
		return super.toString() + "\n\tCaptain: " + captainType;
	}
	
	
	
}
