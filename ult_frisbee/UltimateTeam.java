package ultimatefrissbeeproject;

public class UltimateTeam 
{
	private UltimatePlayer[] players; 
	private Coach[] coaches;
	
	
	public UltimateTeam(UltimatePlayer[] ps, Coach[] cs)
	{
		players = ps;
		coaches = cs;
	}
	
	public String getCutters()
	{
		String cuttersCount = "**CUTTERS**\n";
		for (int i = 0; i<players.length; i++)
		{
			if (players[i].getPosition().equals("cutter"))
			{
				cuttersCount +=players[i].toString();
				cuttersCount += "\n";
			}
		}
		return cuttersCount;
	}
	
	public String getHandlers()
	{
		String handlersCount = "**HANDLERS**\n";
		for (int i = 0; i<players.length; i++)
		{
			if (players[i].getPosition().equals("handler"))
			{
				handlersCount +=players[i].toString();
				handlersCount += "\n";
			}
		}
		return handlersCount;
	}
	
	public String getPlayers()
	{
		String playersCount = "**PLAYERS**\n";
		for (int i = 0; i<players.length; i++)
		{
				playersCount +=players[i].toString();
				playersCount += "\n";
		}
		return playersCount;
	}
	
	public String getCoaches()
	{
		String coachesCount = "**COACHES**\n";
		for (int i = 0; i<coaches.length; i++)
		{
				coachesCount +=coaches[i].toString();
				coachesCount += "\n";
		}
		return coachesCount;
	}
	
	
	public String toString()
	{
		return (("**TEAM**\n\n\n")) + getCoaches() + "\n\n" + getPlayers() + "\n\n" + getCutters() + "\n\n" + getHandlers() ;
	}
	
	
	
	
	
	
	
}
