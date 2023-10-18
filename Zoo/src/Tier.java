
public abstract class Tier
{
	protected String name;
	protected String art;

	public Tier(String name, String art)
	{
		super();
		this.name = name;
		this.art = art;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getArt()
	{
		return art;
	}

	public void setArt(String art)
	{
		this.art = art;
	}

}
