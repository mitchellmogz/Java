package Number3;

public class ItemsClass {

		//Fields
	private int units;
	private double price;
	
		//setUnits
	public void setUnits(int units) throws UnitsException
	{
	
		for(int i = 0; i < 3; i++)
		{
			
			if(units < 0 || units > 100)
			{
				throw new UnitsException(units);
			}
			
			this.units = units;
		}	
	}
		
		//setPrice
	public void setPrice(double price) throws PriceException
	{
	
		for(int i = 0; i < 3; i++)
		{
			
			if(price < 0)
			{
				throw new PriceException(price);
			}
			
			this.price = price;
		}	
	}
	
}
