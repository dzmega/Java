
public class Schuhpaar
{
	private String farbe;
	private int groesse;
	private boolean stoeckel;
	
	public Schuhpaar(String farbe, int groesse, boolean stoeckel)
	{
		super();
		this.farbe = farbe;
		this.groesse = groesse;
		this.stoeckel = stoeckel;
	}

	public String getFarbe()
	{
		return farbe;
	}

	public void setFarbe(String farbe)
	{
		this.farbe = farbe;
	}

	public int getGroesse()
	{
		return groesse;
	}

	public void setGroesse(int groesse)
	{
		this.groesse = groesse;
	}

	public boolean isStoeckel()
	{
		return stoeckel;
	}

	public void setStoeckel(boolean stoeckel)
	{
		this.stoeckel = stoeckel;
	}

	@Override
	public String toString()
	{
		return farbe + " " + groesse + " " + stoeckel;
	}
	
	
}
