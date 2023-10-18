package vererbung;
import java.io.*;

public class Arbeiter extends Mitarbeiter
{
	private double lohnStd;
	private double anzStd;
	
	//konstruktor
	public Arbeiter(String name)
	{
		super(name);
	}
	public Arbeiter(double lohnStd, String name)
	{
		super(name);
		this.lohnStd = lohnStd;
	}
	public Arbeiter(double lohnStd, double anzStd, String name)
	{
		super(name);
		this.lohnStd = lohnStd;
		this.anzStd = anzStd;
	}
	
	//getter
	public double getLohnStd()
	{
		return lohnStd;
	}
	public double getAnzStd()
	{
		return anzStd;
	}
	//setter
	public void setLohnStd(double lohnStd)
	{
		this.lohnStd = lohnStd;
	}
	public void setAnzStd(double anzStd)
	{
		this.anzStd = anzStd;
	}
	
	@Override
	public double berechneEntgeld()
	{
		return anzStd * lohnStd;
	}
	@Override
	public String toString()
	{
		return super.toString() + " Entgeld: " + berechneEntgeld();
	}
	@Override 
	public double bonus(double boni)
	{
		return berechneEntgeld() + boni;
	}
}