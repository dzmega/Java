
public class Saegetier extends Tier
{
	private int anzahlDerBeine;
	
	public Saegetier(String name, String art, int anzahlDerBeine)
	{
		super(name,art);
		this.anzahlDerBeine = anzahlDerBeine;
	}

	public int getAnzahlDerBeine()
	{
		return anzahlDerBeine;
	}

	public void setAnzahlDerBeine(int anzahlDerBeine)
	{
		this.anzahlDerBeine = anzahlDerBeine;
	}

	@Override
	public String toString()
	{
		return name + " " + art + " " + anzahlDerBeine;
	}
	
}
