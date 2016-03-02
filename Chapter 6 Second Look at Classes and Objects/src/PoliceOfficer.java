
public class PoliceOfficer {

		//Fields
	private String name;
	private int badge;
	
		//Constructor
	public PoliceOfficer(String name, int badge)
	{
		this.name = name;
		this.badge = badge;
	}
	
	//toString method
		public String toString()
		{
			String str;
			
				//String describing the item
			str = "Officer: " + name + "\nBadge Number: " + badge;
				
				//RETURN
			return str;
		}
	
}
