
public class Fisch extends Tier
{
	private boolean kannAufblasen;
	
	public Fisch(String name, String art, boolean kannAufblasen)
	{
		super(name,art);
		this.kannAufblasen = kannAufblasen;
	}

	public boolean isKannAufblasen()
	{
		return kannAufblasen;
	}

	public void setKannAufblasen(boolean kannAufblasen)
	{
		this.kannAufblasen = kannAufblasen;
	}

	@Override
	public String toString()
	{
		return name + " " + art + " " + kannAufblasen;
	}
	
}
