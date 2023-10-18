
public class Produkt
{
	private int artikelnummer;
	private String bezeichnung;
	private double preis;
	
	public Produkt(int artikelnummer, String bezeichnung, double preis)
	{
		super();
		this.artikelnummer = artikelnummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}

	public int getArtikelnummer()
	{
		return artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer)
	{
		this.artikelnummer = artikelnummer;
	}

	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	public double getPreis()
	{
		return preis;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}

	@Override
	public String toString()
	{
		return bezeichnung + " " + preis;
	}
	
	
}
