package schulverwaltungssoftware;
import java.io.*;
import java.util.Scanner;
public class Einlesen 
{
	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Mensch[] array = new Mensch[10];
		array[0] = new Schueler();
		
		try
		{
			System.out.println("Geben Sie Ihr Namen ein");
			array[0].setName(reader.readLine());
			
			System.out.println("Geben Sie Ihr Alter ein");
			String sAge = reader.readLine();
			int iAge = Integer.parseInt(sAge);
			array[0].setAlter(iAge); 
			
			System.out.println("In welche Klassenstufe gehen Sie?");
			String sStufe = reader.readLine();
			int iStufe = Integer.parseInt(sStufe);
			array[0].setSchueler().setKlassenstufe(iStufe);
		}
		catch(IOException e)
		{
			System.out.println("Fehler!\n");
		}
		
		System.out.println("\n" + array[0]);
	}
}
