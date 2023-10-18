import java.util.ArrayList;

public class Behälter <T extends Tier>
{
	private String bezeichnung;
	ArrayList<T> list = new ArrayList<T>();
	
	public ArrayList<T> getList()
	{
		return list;
	}

	public void setList(ArrayList<T> list)
	{
		this.list = list;
	}

	public Behälter(String bezeichnung)
	{
		super();
		this.bezeichnung = bezeichnung;
	}
	
	public String getBezeichnung()
	{
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}
	
	@Override
	public String toString()
	{
		return bezeichnung;
	}

	public void speereEin(T tier)
	{
		System.out.println("Eingesperrt");
		list.add(tier);
	}

	public void lasseFrei(T tier)
	{
		System.out.println("Freigelassen");
		list.remove(tier);
	}
	
	public void leereBehaelter()
	{
		list.removeAll(list);
	}
}
