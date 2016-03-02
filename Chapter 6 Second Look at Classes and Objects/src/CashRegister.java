
public class CashRegister {
	
		//Fields
	static int quanity;
	final static double tax = .06;
	static RetailItem item;

		//Constructor
	CashRegister(int q, RetailItem i)
	{
		quanity = q;
		item = i;
		
	}
		//Mutators
	
		//Accessors
	public static double getSubtotal()
	{
		return quanity * item.getRetailCost();
	}
	
	public static double getTax()
	{
		return tax * CashRegister.getSubtotal();
	}
	
	public static double getTotal()
	{
		return getSubtotal() + getTax();
	}
	
}
