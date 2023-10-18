package vererbung;
import java.io.*;

public class Chef extends Mitarbeiter
{
	private double basisgehalt;
	
	//konstruktor
	public Chef(String name)
	{
		super(name);
	}
	public Chef(double basisgehalt, String name)
	{
		super(name);
		this.basisgehalt = basisgehalt;
	}
	
	//getter
	public double getBasisgehalt()
	{
		return basisgehalt;
	}
	
	//setter
	public void setBasisgehalt(double basisgehalt)
	{
		this.basisgehalt = basisgehalt;
	}
	
	@Override
	public double berechneEntgeld()
	{
		return basisgehalt;
	}
	@Override
	public String toString()
	{
		return super.toString() + " Basisgehalt: " + berechneEntgeld();
	}
	@Override
	public double bonus(double boni)
	{
		return berechneEntgeld() + boni;
	}
}