package schulverwaltungssoftware;
import java.io.*;
public class Lehrer extends Mensch
{
	private String unterrichtsfach;
	
	public Lehrer()
	{
		
	}
	public Lehrer(String name, int alter)
	{
		super(name,alter);
	}
	public Lehrer(String unterrichtsfach, String name, int alter)
	{
		super(name, alter);
		this.unterrichtsfach = unterrichtsfach;
	}
	
	public String getUnterrichtsfach()
	{
		return unterrichtsfach;
	}
	
	public void setUnterrichtsfach()
	{
		this.unterrichtsfach = unterrichtsfach;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Unterrichtsfach: " + unterrichtsfach;
	}
}