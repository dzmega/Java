package schulverwaltungssoftware;
import java.io.*;
public class Mensch
{
	private String name;
	private int alter;
	private Schueler schueler;
	
	public Mensch()
	{
		
	}
	public Mensch(String name)
	{
		this.name = name;
	}
	public Mensch(String name, int alter)
	{
		this.name = name;
		this.alter = alter;
	}
	public Mensch(String name, int alter, Schueler schueler)
	{
		this.name = name; 
		this.alter = alter;
		this.schueler = schueler;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAlter()
	{
		return alter;
	}
	public Schueler getSchueler()
	{
		return schueler;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAlter(int alter)
	{
		this.alter = alter;
	}
	public void setSchueler(Schueler schuler)
	{
		this.schueler = schueler;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + " Alter: " + alter;
	}
}