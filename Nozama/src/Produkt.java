
public class Produkt
{
	private String nummer;
	private String bezeichnung;
	private String preis;
	
	public Produkt(String nummer, String bezeichnung, String preis)
	{
		super();
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}
	
	public String getNummer()
	{
		return nummer;
	}
	public void setNummer(String nummer)
	{
		this.nummer = nummer;
	}
	public String getBezeichnung()
	{
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}
	public String getPreis()
	{
		return preis;
	}
	public void setPreis(String preis)
	{
		this.preis = preis;
	}
	
	@Override
	public String toString()
	{
		return bezeichnung + " " + preis;
	}

}
