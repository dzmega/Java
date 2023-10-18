package svs;
import java.io.*;

public class Schueler extends Menschen
{
	private int klassenstufe;
	
	public Schueler()
	{
		
	}
	public Schueler(String name, int alter)
	{
		super(name,alter);
	}
	public Schueler(int klassenstufe, String name, int alter)
	{
		super(name,alter);
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
	
	public double berechneBetrag(int temp)
	{
		double max = (getAlter() / (double)temp ) * 5;
		return max;
	}
}