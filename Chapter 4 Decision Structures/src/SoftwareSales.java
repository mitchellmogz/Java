import java.util.Scanner;
import java.text.DecimalFormat;
public class SoftwareSales 
{

	public static void main(String[] args)
	{
		//Variables
				int sales;
				double cost;
				
					//Scanner Object
				Scanner keyboard = new Scanner(System.in);
				
					//Decimal Format
				DecimalFormat formatter = new DecimalFormat("0.00");
						
					//Ask for a number between 1-10
				System.out.println("Please enter a Quantity of Software Keys.\n");
				sales = keyboard.nextInt();
				
					//If else statement
				if (sales < 10)
				{
					cost = sales * 99;
					System.out.println("You chose " + sales + " keys at $99 each with no discount.\n"
							+ "Your total is $" + formatter.format(cost) + ".");
				}
				else if (sales <= 19)
				{
					cost = (sales * 99) * .8;
					
					System.out.println("You chose " + sales + " keys at $99 each with a %20 discount.\n"
							+ "Your total is $" + formatter.format(cost) + ".");
				}
				
				else if (sales <= 49)
				{
					cost = (sales * 99) * .7;
					
					System.out.println("You chose " + sales + " keys at $99 each with a %30 discount.\n"
							+ "Your total is $" + formatter.format(cost) + ".");
				}
				
				else if (sales <= 99)
				{
					cost = (sales * 99) * .6;
					
					System.out.println("You chose " + sales + " keys at $99 each with a %40 discount.\n"
							+ "Your total is $" + formatter.format(cost) + ".");
				}
				
				else if (sales > 100)
				{
					cost = (sales * 99) * .5;
					
					System.out.println("You chose " + sales + " keys at $99 each with a %50 discount.\n"
							+ "Your total is $" + formatter.format(cost) + ".");
				}
		
	}

}
