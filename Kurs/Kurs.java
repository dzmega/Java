import java.io.*;
public class Kurs
{
	//Instanzattribute
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	double euro,dollar,erg = 0;
	String eingabe = null;
	
	//Konstruktor
	public Kurs (double dollar)
	{
		this.dollar=dollar;
		gebeEin();
	}
	
	//Main Methode
	public static void main (String arg[])
	{
		new Kurs (1.1158);
	}
	
	//Instanzmethode
	private void gebeEin()
	{
		do
		{
			try
			{
				System.out.print("Euro eingeben bitte: ");
				eingabe = in.readLine();
				euro = Double.valueOf(eingabe.replace(',','.')).doubleValue();
				
				if(euro > 0)
				{
					erg = euro * dollar;
					System.out.println("Dollarwert = "+erg);
				}
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			catch(IOException e)
			{
				System.out.println("Ein/Ausgabefehler");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Numerischer Wert erforderlich");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage() +"Betreuer holen");
			}
		}
		while(euro!=0);
	}
}