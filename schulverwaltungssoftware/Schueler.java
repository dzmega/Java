package schulverwaltungssoftware;
import java.io.*;
public class Schueler extends Mensch
{
	private int klassenstufe;
	private double jahresbeitragsfaktor = 5;

	public Schueler()
	{
		
	}
	public Schueler(String name, int alter)
	{
		super(name, alter);
	}
	public Schueler(int klassenstufe, String name, int alter)
	{
		super(name, alter);
		this.klassenstufe = klassenstufe;
	}
	
	public int getKlassenstufe()
	{
		return klassenstufe;
	}
	
	public void setKlassenstufe(int klassenstufe)
	{
		this.klassenstufe = klassenstufe;
	}
	
	public double berechnenBeitrag()
	{
		return this.getAlter() / klassenstufe * jahresbeitragsfaktor;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Klassenstufe " + klassenstufe;
	}
}