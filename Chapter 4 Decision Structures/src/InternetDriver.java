import java.text.DecimalFormat;
import java.util.Scanner;
public class InternetDriver {

	public static void main(String[] args) {
			//variables
		double price = 0;
		double mega = 0;
		double cent = 0;
		char pack;
			//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
			//Decimal Format
		DecimalFormat formatter = new DecimalFormat("#,###,#00.00");
		DecimalFormat bender = new DecimalFormat("###,##0.00");
		
			//Present Package Plans
		System.out.println("Package A:\nFor $49.99 per month 1000MB are provided." +
			"\nAdditional MB are $0.40 per 50MB.\n\nPackage B:\n" 
			+ "For $69.99 per month 3000MB are provided.\n" + 
			"Additional MB are $0.30 per 50MB.\n\nPackage C:\n"
			+ "For $79.99 per month unlimited MB are provided.\n\n"
			+ "Please select Package A, B, or C.");
		pack = keyboard.next().charAt(0);
		
		switch (pack)
		{
		case 'A':
		case 'a':
			{
				//instance
				Internet firstPack = new Internet(price, mega, cent);
				firstPack.setPrice(49.99);
				System.out.println("\nYou have selected Package A.\nPlease enter the number of"
						+ " MB used this month.");
				
				firstPack.setMega(keyboard.nextDouble());
				System.out.println("\nYour bill is $" + formatter.format(firstPack.getPackA()) + 
						".");
				
				if (firstPack.getMega() > 3500 && firstPack.getMega() < 4750)
				{
					System.out.println("You have the potential of saving money by switching to "
							+ "Package B.\nYou could save $" + 
							bender.format((firstPack.getPackA() - 69.99 )) );
				}
				else if (firstPack.getMega() > 4750)
				{
					System.out.println("You have the potential of saving money by switching to "
							+ "Package C.\nYou could save $" + 
							bender.format((firstPack.getPackA() - 79.99 )) );
				}
				
				
			}
			break;
		case 'B':
		case 'b':
			{
				//instance
				Internet firstPack = new Internet(price, mega, cent);
				firstPack.setPrice(69.99);
				System.out.println("\nYou have selected Package B.\nPlease enter the number of"
					+ " MB used this month.");
			
				firstPack.setMega(keyboard.nextDouble());
				System.out.println("\nYour bill is $" + formatter.format(firstPack.getPackB()) + 
					".");
				
				if (firstPack.getMega() >= 4700)
				{
					System.out.println("You have the potential of saving money by switching to "
							+ "Package C.\nYou could save $" + 
							bender.format((firstPack.getPackB() - 79.99 )) );
				}
				else 
				{
					System.out.println();
				}
			}
			
			break;
		
		case 'C':
		case 'c':
		{
				Internet firstPack = new Internet(price, mega, cent);
				firstPack.setPrice(79.99);
				System.out.println("\nYou have selected Package C.\nPlease enter the number of"
					+ " MB used this month.");
			
				firstPack.setMega(keyboard.nextDouble());
				System.out.println("\nYour bill is $" + formatter.format(firstPack.getPackC()) + 
					".");
		}
		
		
		

		}
		}
}
