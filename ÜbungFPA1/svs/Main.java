package svs;
import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		
		Menschen mensch = new Menschen();
		Lehrer lehrer = new Lehrer();
		Schueler schueler = new Schueler();
		
		try
		{
			System.out.println("Namen eingeben: ");
			mensch.setName(br.readLine());
			System.out.println("Alter eingeben: ");
			String sAge = br.readLine();
			int age = Integer.parseInt(sAge);
			mensch.setAlter(age);
		}
		catch(IOException e)
		{
			System.out.println("Fehler!");
		}
		
		System.out.println("Namen eingeben: ");
		schueler.setName(in.nextLine());
		System.out.println("Alter eingeben: ");
		schueler.setAlter(in.nextInt());
		
		int temp;
		do
		{
			System.out.println("Klassenstufe eingeben: ");
			temp = in.nextInt();
			if(temp > 12 || temp < 10)
			{
				System.out.println("Falsche Klassenstufe angegeben!");
			}
			else
			{
				schueler.setKlassenstufe(temp);
			}
		}while(temp > 12 || temp < 10);
		System.out.println("Der Jahresbeitrag fuer diesen Schueler ist: " + schueler.berechneBetrag(temp));
	}
}