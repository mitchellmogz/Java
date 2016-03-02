
public class RetailItemDemo {
	

	public static void main (String[] args) 
	{
		RetailItem num1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem num2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem num3 = new RetailItem("Shirt", 20, 24.95);
		
		System.out.println("Item #1: " + num1.getDescription() + "  " + num1.getUnitsOnHand() + "  " + num1.getPrice());
		System.out.println("Item #2: " + num2.getDescription() + "  " + num2.getUnitsOnHand() + "  " + num2.getPrice());
		System.out.println("Item #3: " + num3.getDescription() + "  " + num3.getUnitsOnHand() + "  " + num3.getPrice());
	}
}