import java.io.*;
public class Personal
{
	private String name;
	private String gebDat;
	private double gehalt;
	private int id;
	private static int counter = 0;
	private Adresse adresse;
	
	//konstruktor
	public Personal(Adresse adresse)
	{
		this.counter++;
		this.id = this.counter;
		this.adresse = adresse;
	}
	public Personal(String name, Adresse adresse)
	{
		this.name = name;
		this.counter++;
		this.id = this.counter;
		this.adresse = adresse;
	}
	public Personal(String name, String gebDat, Adresse adresse)
	{
		this.name = name;
		this.gebDat = gebDat;
		this.counter++;
		this.id = this.counter;
		this.adresse = adresse;
	}
	public Personal(String name, String gebDat, double gehalt, Adresse adresse)
	{
		this.name = name;
		this.gebDat = gebDat;
		this.gehalt = gehalt;
		this.counter++;
		this.id = this.counter;
		this.adresse = adresse;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public String getgebDat()
	{
		return gebDat;
	}
	public double getGehalt()
	{
		return gehalt;
	}
	public int getCounter()
	{
		return counter;
	}
	public int getId()
	{
		return id;
	}
	public Adresse getAdresse()
	{
		return adresse;
	}
	
	//setter
	public void setName(String name)
	{
		this.name = name;
	}
	public void setgebDat(String gebDat)
	{
		this.gebDat = gebDat;
	}
	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
	public void	setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}

	@Override
	public String toString()
	{
		return "Name: " + name + " ID: " + id;
	}
}