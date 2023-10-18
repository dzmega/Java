
public class Groesse
{
	private String bezeichnung;
	private double zuschlag;
	
	public Groesse(String bezeichnung, double zuschlag)
	{
		super();
		this.bezeichnung = bezeichnung;
		this.zuschlag = zuschlag;
	}

	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	public double getZuschlag()
	{
		return zuschlag;
	}

	public void setZuschlag(double zuschlag)
	{
		this.zuschlag = zuschlag;
	}

	@Override
	public String toString()
	{
		return bezeichnung;
	}
	
}
