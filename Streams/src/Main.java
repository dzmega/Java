import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Map<String, Integer> anzahlTageInMonat = new HashMap<String, Integer>();
		anzahlTageInMonat.put("Januar", 31);
		anzahlTageInMonat.put("Februar", 28);
		anzahlTageInMonat.put("März", 31);
		anzahlTageInMonat.put("April", 30);
		
		System.out.println(anzahlTageInMonat.get("Februar"));
		
		Set<String> alleSchluessel = anzahlTageInMonat.keySet();
		System.out.println(alleSchluessel);
		
		Integer tage = anzahlTageInMonat.remove("Februar");
		
		Collection<Integer> werte = anzahlTageInMonat.values();
		System.out.println(werte);*/
		
		ArrayList<Schuhpaar> schuhPaare = new ArrayList<Schuhpaar>();
		schuhPaare.add(new Schuhpaar("schwarz",38,true));
		schuhPaare.add(new Schuhpaar("rot",38,true));
		schuhPaare.add(new Schuhpaar("rot",39,true));
		schuhPaare.add(new Schuhpaar("schwarz",38,false));
		schuhPaare.add(new Schuhpaar("weiß",39,false));
		
		schuhPaare.stream()
				.filter(s -> s.getGroesse() == 38 && s.isStoeckel())
				.forEach(s -> System.out.println(s.toString()));
	}

}
