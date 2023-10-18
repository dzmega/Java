package einstieg;
import java.io.*;

public class Personal{
	private String name;
	private String gebDat;
	private double gehalt;
	private static int counter = 0;
	private int id;
	private Adresse adresse;
	
	//konstruktor
	public Personal()
	{
		this.counter++;
		id = this.counter;
	}
	public Personal(String name)
	{
		this.counter++;
		this.name = name;
		id = this.counter;
	}
	public Personal(String name, double gehalt)
	{
		this.counter++;
		this.name = name;
		this.gehalt = gehalt;
		id = this.counter;
	}
	public Personal(String name, String gebDat, double gehalt)
	{
		this.counter++;
		this.name = name;
		this.gebDat = gebDat;
		this.gehalt = gehalt;
		id = this.counter;
	}
	public Personal(String name, String gebDat, double gehalt, Adresse adresse)
	{
		this.counter++;
		this.name = name;
		this.gebDat = gebDat;
		this.gehalt = gehalt;
		this.adresse = adresse;
		id = this.counter;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public double getGehalt()
	{
		return gehalt;
	}
	public String getGebDat()
	{
		return gebDat;
	}
	public int getCounter()
	{
		return counter;
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
	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
	public void setGebDat(String gebDat)
	{
		this.gebDat = gebDat;
	}
	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}
	
	@Override
	public String toString()
	{
		return "ID: " + id + " Name: " + name + "  Geburtstag: " + gebDat + " Gehalt: " + gehalt;
	}
}