package pizzabringdienst;
import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		Pizza salami = new Pizza("Salami",8.5);
		
		System.out.println("Saucentyp eingeben:");
		salami.getPizzaSpecial2012().setSaucentyp(myObj.nextLine());
	}
}