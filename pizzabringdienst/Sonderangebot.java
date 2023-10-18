package pizzabringdienst;
import java.io.*;
public class Sonderangebot extends Pizza
{
	private float rabatt = 25;
	
	//konstruktor
	public Sonderangebot()
	{
		
	}
	public Sonderangebot(float rabatt)
	{
		this.rabatt = rabatt;
	}
	public Sonderangebot(float rabatt, String name, float preis)
	{
		super(name,preis);
		this.rabatt = rabatt;
	}
	
	//getter
	public float getRabatt()
	{
		return rabatt;
	}
	
	//setter
	public void setRabatt(float rabatt)
	{
		this.rabatt = rabatt;
	}
}