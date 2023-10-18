
public class Warenkorb
{
	private static int count = 0;
	private String name;
	
	public Warenkorb(String name)
	{
		super();
		this.name = name;
		count++;
	}

	public static int getCount()
	{
		return count;
	}

	public static void setCount(int count)
	{
		Warenkorb.count = count;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name + "_" + count + ".txt";
	}
	
	
}
