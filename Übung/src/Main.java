import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		ArrayList<Person> personen = new ArrayList<Person>();
		
		personen.add(new Person("David"));
		personen.add(new Person("Lukas"));
		personen.add(new Person("Dennis"));
		personen.add(new Person("Leon"));
		personen.add(new Person("Marvin"));
		personen.add(new Person("Alex"));
		
		personen.sort((p1,p2) -> {return p1.getName().compareTo(p2.getName());});
		personen.forEach(p -> System.out.println(p.getName()));
		
		/*Bier[] biere =
			{
					new Bier("Würzburger","Würzburg",0.5F),
					new Bier("Becks","Bremen",0.33F),
					new Bier("Paulaner","München",0.5F)
			};
		
		for(Bier b: biere)
		{
			System.out.println(b);
		}
		
		Arrays.sort(biere);
		
		for(Bier b: biere)
		{
			System.out.println(b);
		}
		
		int[] array = {5,6,1,123,32,80,74,8};
		ArrayList<String> personen = new ArrayList<String>();
		personen.add("David");
		personen.add("Lukas");
		personen.add("Dennis");
		personen.add("Leon");
		personen.add("Marvin");
		personen.add("Alex");
		
		System.out.println("Unsortierte Liste:");
		
		for(int i: array)
		{
			System.out.println(i);
		}
		
		Arrays.sort(array);
		
		for(int i: array)
		{
			System.out.println(i);
		}
		
		for(String str: personen)
		{
			System.out.println(str);
		}
		
		Collections.sort(personen);
		
		for(String str: personen)
		{
			System.out.println(str);
		}*/
	}
}
