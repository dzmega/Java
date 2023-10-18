
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Behälter<Vogel> voliere = new Behälter<Vogel>("Voliere");
		Vogel wheezy = new Vogel("Wheezy","Pinguin",false);
		Saegetier simba = new Saegetier("Simba","Löwe",4);
		
		voliere.speereEin(wheezy);
		
		voliere.getList().forEach(v -> System.out.println(v.toString()));
	}

}
