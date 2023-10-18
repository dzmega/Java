import java.util.Objects;

public class Film
{
	private int nummer;
	private String name;
	private Genre genre;
	private int laenge;
	
	public Film(int nummer, String name, Genre genre, int laenge)
	{
		super();
		this.nummer = nummer;
		this.name = name;
		this.genre = genre;
		this.laenge = laenge;
	}

	public int getNummer()
	{
		return nummer;
	}

	public void setNummer(int nummer)
	{
		this.nummer = nummer;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Genre getGenre()
	{
		return genre;
	}

	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	public int getLaenge()
	{
		return laenge;
	}

	public void setLaenge(int laenge)
	{
		this.laenge = laenge;
	}

	@Override
	public String toString()
	{
		return nummer + " " + name + " " + laenge;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(genre, laenge, name, nummer);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(genre, other.genre) && laenge == other.laenge && Objects.equals(name, other.name)
				&& nummer == other.nummer;
	}
}
