
public class Extras
{
	private String bezeichnung;
	private double zuschlag;
	
	public Extras(String bezeichnung, double zuschlag)
	{
		super();
		this.bezeichnung = bezeichnung;
		this.zuschlag = zuschlag;
	}

	public String getBezeichnug()
	{
		return bezeichnung;
	}

	public void setBezeichnug(String bezeichnug)
	{
		this.bezeichnung = bezeichnug;
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
