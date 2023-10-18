package einstieg;
import java.io.*;

public class Adresse
{
	private String strasse;
	private String plz;
	private String ort;
	
	//konstruktor
	public Adresse()
	{
		
	}
	public Adresse(String strasse)
	{
		this.strasse = strasse;
	}
	public Adresse(String strasse, String plz)
	{
		this.strasse = strasse;
		this.plz = plz;
	}
	public Adresse(String strasse, String plz, String ort)
	{
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
	}
	
	//getter
	public String getStrasse()
	{
		return strasse;
	}
	public String getPlz()
	{
		return plz;
	}
	public String getOrt()
	{
		return ort;
	}
	
	//setter
	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}
	public void setPlz(String plz)
	{
		this.plz = plz;
	}
	public void setOrt(String ort)
	{
		this.ort = ort;
	}
	
	@Override
	public String toString()
	{
		return " Strasse: " + strasse + " PLZ: " + plz + " Ort: " + ort;
	}
}