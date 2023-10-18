package vererbung;
import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		/*Angestellter paul = new Angestellter(17.20,140,"Paul");
		Angestellter kurt = new Angestellter(4000,500,"Kurt");
		Praktikant olga = new Praktikant(500,"Olga");
		Chef otto = new Chef(7000,"Otto");*/
		
		Mitarbeiter[] array = new Mitarbeiter[4];
		array[0] = new Angestellter(17.20,140,"Paul");
		array[1] = new Angestellter(4000,500,"Kurt");
		array[2] = new Praktikant(500,"Olga");
		array[3] = new Chef(7000,"Otto");
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("\n");
		
		((Chef)array[3]).setBasisgehalt(12000.12);
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("\n");
	}
}