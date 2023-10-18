import java.io.*;
import java.util.Scanner;
public class Testdriver
{
	public static void main(String args[])
	{
		/*rsonal array[] = new Personal[4]; 
		array[0] = new Personal("Karl","11.11.2005",5000.60,new Adresse("Ziegener","97347","Kirchheim"));
		array[1] = new Personal("David","11.11.2005",5000.60,new Adresse("Eichhornstrasse","97232","Giebelstadt"));
		array[2] = new Personal("Rena","11.11.2005",5000.60,new Adresse("Heuchelhofer","97199","Würzburg"));
		array[3] = new Personal("Dennis","11.11.2005",5000.60,new Adresse("Wiener Ring","97199","Würzburg"));
		
		for(int i = 0;i < 4;i++)
		{
			System.out.println("Daten: " + array[i] + "  => Adresse: " + array[i].getAdresse());
		}
		System.out.println("\n");
		
		Adresse alt = array[3].getAdresse();
		array[3].setAdresse(array[1].getAdresse());
		for(int i = 0;i < 4;i++)
		{
			System.out.println("Daten: " + array[i] + "  => Adresse: " + array[i].getAdresse());
		}
		System.out.println("\n");
		
		array[3].setAdresse(alt);
		for(int i = 0;i < 4;i++)
		{
			System.out.println("Daten: " + array[i] + "  => Adresse: " + array[i].getAdresse());
		}
		*/
		Scanner myObj = new Scanner(System.in);
		System.out.println("Namen eingeben: ");
		String person = myObj.nextLine();
		System.out.println("Geburtstag eingeben: ");
		String birthday = myObj.nextLine();
		System.out.println("Gehalt eingeben: ");
		double salery = myObj.nextDouble();
		System.out.println("Strasse eingeben: ");
		String street = myObj.nextLine();
		System.out.println("Postleitzahl eingeben: ");
		String postlz = myObj.nextLine();
		System.out.println("Ort eingeben: ");
		String town = myObj.nextLine();
		
		Personal guy = new Personal(person,birthday,salery,new Adresse(street,postlz,town));
		System.out.println(guy);
	}
}