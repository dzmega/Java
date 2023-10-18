package pizzabringdienst;
import java.io.*;
public class Pizza
{
	private String name;
	private double preis;
	private PizzaSpecial2012 pizzaSpecial2012;
	
	//konstruktor
	public Pizza()
	{
		
	}
	public Pizza(String name, double preis)
	{
		this.name = name;
		this.preis = preis;
	}
	public Pizza(String name, double preis, PizzaSpecial2012 pizzaSpecial2012)
	{
		this.name = name;
		this.preis = preis;
		this.pizzaSpecial2012 = pizzaSpecial2012;
	}
	
	//getter
	public String getName()
	{
		return name;
	}
	public double getPreis()
	{
		return preis;
	}
	public PizzaSpecial2012 getPizzaSpecial2012()
	{
		return pizzaSpecial2012;
	}
	
	//setter
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	public void setPizzaSpecial2012(PizzaSpecial2012 pizzaSpecial2012)
	{
		this.pizzaSpecial2012 = pizzaSpecial2012;
	}
}