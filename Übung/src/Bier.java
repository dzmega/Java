import java.util.Comparator;
import java.util.Objects;

public class Bier implements Comparable<Bier>
{
	private String name;
	private String herkunft;
	private float inhalt;
	
	public Bier(String name, String herkunft, float inhalt)
	{
		super();
		this.name = name;
		this.herkunft = herkunft;
		this.inhalt = inhalt;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHerkunft()
	{
		return herkunft;
	}

	public void setHerkunft(String herkunft)
	{
		this.herkunft = herkunft;
	}

	public float getInhalt()
	{
		return inhalt;
	}

	public void setInhalt(float inhalt)
	{
		this.inhalt = inhalt;
	}

	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(herkunft, inhalt, name);
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
		Bier other = (Bier) obj;
		return Objects.equals(herkunft, other.herkunft)
				&& Float.floatToIntBits(inhalt) == Float.floatToIntBits(other.inhalt)
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Bier o)
	{
		// TODO Auto-generated method stub
		if(this.getName() == null && o.getName() == null)
		{
			return 0;
		}
		if(o.getName() == null)
		{
			return 1;
		}
		if(this.getName() == null)
		{
			return -1;
		}
		return this.getName().compareTo(o.getName());
	}
	
}
