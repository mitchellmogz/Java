import java.text.DecimalFormat;
import java.util.Scanner;
public class ShippingDriver {
	
	public static void main (String[] args) 
		{
			//Variables
		int weight;
		int miles;
		
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Decimal Format
		DecimalFormat formatter = new DecimalFormat("0.00");
		
			//Get the package weight.
		System.out.print("Enter the package weight in Kg. ");
		weight = keyboard.nextInt();
		
			//Get the miles shipped.
		System.out.print("Enter the miles shipped. ");
		miles = keyboard.nextInt();
		
			//Creating an instance
		Shipping firstPack = new Shipping(weight, miles);
		
			//Output
		if (firstPack.getWeight() <= 2 )
		{
			if (firstPack.getWeight() < 500)
			{
				System.out.println("Your package weights " + firstPack.getWeight() +
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $1.10");
			}
			
			else if (firstPack.getMiles() <= 999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() <= 1499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() <= 1999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() <= 2499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() <= 2999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() <= 3499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() <= 3999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $1.10 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross1()) + ".");
			}
			else if (firstPack.getMiles() > 4000)
			{
			System.out.println("Where are you shipping this thing?");
			}
				
		}
		else if (firstPack.getWeight() <= 6 )
		{
			
			if (firstPack.getWeight() < 500)
			{
				System.out.println("Your package weights " + firstPack.getWeight() +
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $2.20");
			}
			
			else if (firstPack.getMiles() <= 999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() <= 1499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() <= 1999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() <= 2499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() <= 2999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() <= 3499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() <= 3999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $2.20 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross2()) + ".");
			}
			else if (firstPack.getMiles() > 4000)
			{
			System.out.println("Where are you shipping this thing?");
			}
		}
		else if (firstPack.getWeight() <= 10 )
		{
			if (firstPack.getWeight() < 500)
			{
				System.out.println("Your package weights " + firstPack.getWeight() +
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $3.70");
			}
			
			else if (firstPack.getMiles() <= 999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() <= 1499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() <= 1999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() <= 2499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() <= 2999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() <= 3499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() <= 3999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $3.70 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross3()) + ".");
			}
			else if (firstPack.getMiles() > 4000)
			{
			System.out.println("Where are you shipping this thing?");
			}
		}
		else if (firstPack.getWeight() > 10 )
		{
			if (firstPack.getWeight() < 500)
			{
				System.out.println("Your package weights " + firstPack.getWeight() +
						" Kg with a rate of 4.80 per 500 miles.\nYour fee is $4.80");
			}
				
			else if (firstPack.getMiles() <= 999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() <= 1499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() <= 1999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() <= 2499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() <= 2999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() <= 3499)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() <= 3999)
			{
				System.out.println("Your package weights " + firstPack.getWeight() + 
						" Kg with a rate of $4.80 per 500 miles.\nYour fee is $" + 
						formatter.format(firstPack.getGross4()) + ".");
			}
			else if (firstPack.getMiles() > 4000)
			{
			System.out.println("Where are you shipping this thing?");
			}
		}
		
	}
}