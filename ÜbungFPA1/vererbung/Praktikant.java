package vererbung;
import java.io.*;

public class Praktikant extends Mitarbeiter
{
	private double hungerlohn;
	
	//konstruktor
	public Praktikant(String name)
	{
		super(name);
	}
	public Praktikant(double hungerlohn, String name)
	{
		super(name);
		this.hungerlohn = hungerlohn;
	}
	
	//getter
	public double getHungerlohn()
	{
		return hungerlohn;
	}
	
	//setter
	public void setHungerlohn(double hungerlohn)
	{
		this.hungerlohn = hungerlohn;
	}
	
	@Override
	public double berechneEntgeld()
	{
		return hungerlohn;
	}
	@Override
	public String toString()
	{
		return super.toString() + " Hungerlohn: " + berechneEntgeld();
	}
	@Override
	public double bonus(double boni)
	{
		return berechneEntgeld() + boni;
	}
}
