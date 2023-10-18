package svs;
import java.io.*;

public class Menschen
{
	private String name;
	private int alter;
	
	public Menschen()
	{
		
	}
	public Menschen(String name)
	{
		this.name = name;
	}
	public Menschen(String name, int alter)
	{
		this.name = name; 
		this.alter = alter;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAlter()
	{
		return alter;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAlter(int alter)
	{
		this.alter = alter;
	}
}