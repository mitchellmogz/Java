
public class RetailItem {
	
	//variables
		private String description;
		private int unitsOnHand;
		private double price;
	
	// Constructor
		public RetailItem(String descript, int uoh, double cost)
		{
			description = descript;
			unitsOnHand = uoh;
			price = cost;
		}
		
	//Mutator
		public void setDescription(String descript)
		{
			description = descript;
		}
				
		public void setUnitsOnHand (int uoh)
		{
			unitsOnHand = uoh;
		}
			
		public void setPrice (double cost)
		{
			price = cost;
		}
			
	//Accessors
		public String getDescription()
		{
			return description;
		}
			
		public int getUnitsOnHand()
		{
			return unitsOnHand;
		}
			
		public double getPrice()
		{
			return price;
		}
			
}
