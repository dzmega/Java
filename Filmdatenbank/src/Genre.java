
public class Genre
{
	private String bezeichnung;

	public Genre(String bezeichnung)
	{
		super();
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}

	@Override
	public String toString()
	{
		return bezeichnung;
	}
}
