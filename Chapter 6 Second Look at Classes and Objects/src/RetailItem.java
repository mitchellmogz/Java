import java.text.DecimalFormat;

public class RetailItem {

		//Fields
	private String description;
	private int itemNumber;
	private CostData cost;
	
		//Constructor
	public RetailItem(String d, int i, double w, double r)
	{
		description = d;
		itemNumber = i;
		cost = new CostData(w, r);
	}
	
		//toString method
	public String toString()
	{
		String str;
	
		//DecimalFormat
	DecimalFormat dollar = new DecimalFormat("#,##0.00");
	
		//String describing the item
	str = "Description: " + description + "\nItem Number: " + itemNumber + "\nWholesale Cost: $" + 
		  dollar.format(cost.wholesale) + "\nRetail Price: $" + dollar.format(cost.retail) +
		  "\nSubtotal: $" + dollar.format(CashRegister.getSubtotal()) + "\nTax: $" + dollar.format(CashRegister.getTax()) +
		  "\nTotal: $" + dollar.format(CashRegister.getTotal());
	
		//RETURN
	return str;
	}
	
	public double getRetailCost()
	{
		return cost.getRetail();
	}
	
		//CostData INNER class
	private class CostData
	{
			//Fields
		public double wholesale;
		public double retail;
		
			//Constructor
		public CostData(double w, double r)
		{
			wholesale = w;
			retail = r;
		}	
		
			//Mutator
		public void setWhole(double w)
		{
			wholesale = w;
		}
		
		public void setRetail(double r)
		{
			retail = r;
		}
		
			//Accessor
		public double getWhole()
		{
			return wholesale;
		}
		
		public double getRetail()
		{
			return retail;
		}
		
	}
}
