package vererbung;
import java.io.*;

public abstract class Mitarbeiter
{
	protected String name; 
	protected String adresse;
	
	//konstruktor
	public Mitarbeiter()
	{
		
	}
	public Mitarbeiter(String name)
	{
		this.name = name;
	}
	public Mitarbeiter(String name, String adresse)
	{
		this.name = name;
		this.adresse = adresse;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public String getAdresse()
	{
		return adresse;
	}
	
	//setter
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAdresse(String name)
	{
		this.adresse = adresse;
	}
	
	@Override
	public String toString()
	{
		if(adresse == null)
		{
			return "Name: " + name;
		}
		else
		{
			return "Name: " + name + " Adresse " + adresse;
		}
	}
	abstract double berechneEntgeld();
	abstract double bonus(double boni);
}