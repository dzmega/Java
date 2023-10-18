package vererbung;
import java.io.*;

public class Angestellter extends Mitarbeiter
{
	private double gehalt;
	private double zulage;
	
	//konstruktor
	public Angestellter(String name)
	{
		super(name);
	}
	public Angestellter(double gehalt, String name)
	{
		super(name);
		this.gehalt = gehalt;
	}
	public Angestellter(double gehalt, double zulage, String name)
	{
		super(name);
		this.gehalt = gehalt;
		this.zulage = zulage;
	}
	
	//getter
	public double getGehalt()
	{
		return gehalt;
	}
	public double getZulage()
	{
		return zulage;
	}
	
	//setter
	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
	public void setZulage(double zulage)
	{
		this.zulage = zulage;
	}
	
	@Override
	public double berechneEntgeld()
	{
		return gehalt + zulage;
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