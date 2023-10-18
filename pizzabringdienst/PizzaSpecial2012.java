package pizzabringdienst;
import java.io.*;
public class PizzaSpecial2012 extends Pizza
{
	private String saucentyp;
	private int schaerfegrad;
	
	//konstruktor
	public PizzaSpecial2012()
	{
		
	}
	public PizzaSpecial2012(String name, double preis)
	{
		super(name,preis);
	}
	public PizzaSpecial2012(String saucentyp, int schaerfegrad, String name, double preis)
	{
		super(name,preis);
		this.saucentyp = saucentyp;
		this.schaerfegrad = schaerfegrad;
	}
	
	//getter
	public String getSaucentyp()
	{
		return saucentyp;
	}
	public int getSchaerfegrad()
	{
		return schaerfegrad;
	}
	
	//setter
	public void setSaucentyp(String saucentyp)
	{
		this.saucentyp = saucentyp;
	}
	public void setSchaerfegrad(int schaerfegrad)
	{
		this.schaerfegrad = schaerfegrad;
	}
}