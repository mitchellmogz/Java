
public class Item {
	
		//Fields
	private String description;
	private int number;
	
		//First Constructor
	public Item(String descp, int num)
	{
		description = descp;
		number = num;
	}

		//Copy Constructor
	public Item(Item object2)
	{
		description = object2.description;
		number = object2.number;
	}

		//Accessor
	public String getDescption()
	{
		return description;
	}
	
	public int getNumber()
	{
		return number;
	}
	
		//using toString to return
	public String toString()
	{
		String str = "Description: " + description + 
					 "\nNumber: " + number + "\n";
		
		return str;
	}
}
