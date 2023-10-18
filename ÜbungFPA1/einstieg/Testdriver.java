package einstieg;
import java.io.*;
import java.util.Scanner;

public class Testdriver
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		Personal karl = new Personal("Karl","21.06.1965",1500.60, new Adresse("Marktlatz","97199","Ochsenfurt"));
		Personal david = new Personal("David","11.11.2005",4300.50, new Adresse("Eichhornstrasse","97232","Giebelstadt"));
		
		System.out.println(karl);
		System.out.println(david);
		System.out.println("Anzahl der Mitarbeiter: " + david.getCounter() + "\n");
		
		Personal[] array = new Personal[4];
		array[0] = karl;
		array[1] = david;
		array[2] = new Personal("Dennis","13.07.2004",500, new Adresse("Wiener Ring","97084","Wuerzburg"));
		array[3] = new Personal("Rena","09.11.1945",3.55, new Adresse("Heuchelhofer","97084","Wuerzburg"));
		array[3].getAdresse().setStrasse("Igelweg");
		
		for(int i = 0; i < 4; i++)
		{
			System.out.print(array[i]);
			System.out.print(array[i].getAdresse() + "\n");
		}
		System.out.println("Anzahl der Mitarbeiter: " + array[3].getCounter() + "\n");
	}
}