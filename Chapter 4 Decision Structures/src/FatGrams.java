import java.util.Scanner;
import java.text.DecimalFormat;
public class FatGrams
{

	public static void main(String[] args)
	{
		//Variables
				double calories;
				double fat;
				
					//Scanner Object
				Scanner keyboard = new Scanner(System.in);
				
					//Decimal Format
				DecimalFormat formatter = new DecimalFormat("0.00");
						
					//Ask for the number of calories
				System.out.println("Please enter the number of calories.");
				calories = keyboard.nextDouble();
				
				//Ask for the number of fat grams
				System.out.println("Please enter a the number of grams of fat.");
				fat = keyboard.nextDouble();
				
					//instance
				FatGramsDemo firstPack = new FatGramsDemo(calories, fat);
				
					//If else statement
				if (firstPack.getGross() <= 30)
					{
						System.out.println("The percent of calories from fat are %" + 
								formatter.format(firstPack.getGross()) + ", which is low in fat.");
					}
				else if (firstPack.getGross() <= 100)
					{
						System.out.println("The percent of calories from fat are %" + 
								formatter.format(firstPack.getGross()) + ".");
					}
				
				else if (firstPack.getGross() > 100)
				{					
					System.out.println("The numbers you have entered are invalid.");
				}
		
	}

}
