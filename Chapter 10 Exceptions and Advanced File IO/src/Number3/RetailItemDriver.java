package Number3;
import java.io.IOException;
import java.util.Scanner;

public class RetailItemDriver {
	
	public static void main(String[] args) throws IOException
	{
		
			//variables
		int[] units = new int[3];
		double[] price = new double[3];
		String[] description = {"Jackets", "Designer Jeans", "Shirts"};
		
			//step by step
		ItemsClass fry = new ItemsClass();
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//sweet nothing
		try
		{
			for(int i = 0; i < description.length; i++)
			{
				System.out.println("Please enter units on hand for " + description[i] + "." );
				units[i] = keyboard.nextInt();
				fry.setUnits(units[i]);
			}
		}
		catch(UnitsException ex)
		{
			System.out.println(ex.getMessage());
		}
		
			//Price
		try
		{
			for(int i = 0; i < description.length; i++)
			{
				System.out.println("Please enter the price for " + description[i] + "." );
				price[i] = keyboard.nextDouble();
				fry.setPrice(price[i]);;
			}
		}
		catch(PriceException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("The number of units of Jackets on hand are " + units[0] + ", and each cost " + price[0]);
		System.out.println("The number of units of Jeans on hand are " + units[1] + ", and each cost " + price[1]);
		System.out.println("The number of units of Shirts on hand are " + units[2] + ", and each cost " + price[2]);
		
		keyboard.close();
		
	
	}		
}
