import java.util.Scanner;
// HOT Number 1 FastFood

public class FastFood
{
	public static void main(String[] args)
	{
		// Variables
		double numberOfHamburgers;
		double numberOfCheesburgers;
		double numberOfSodas;
		double numberOfFries;
		double costOfHamburger;
		double costOfCheeseburger;
		double costOfSoda;
		double costOfFry;
		double totalHamburger;
		double totalCheeseburger;
		double totalSoda;
		double totalFry;
		double totalCost;
		String name;
		
		// Variable Amounts
		costOfHamburger = 1.25;
		costOfCheeseburger = 1.5;
		costOfSoda = 1.95;
		costOfFry = .95;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// How many Hamburgers
		System.out.print("How many hamburgers would you like?");
		numberOfHamburgers = keyboard.nextDouble();
		
		// How many Cheeseburgers
		System.out.print("How many cheeseburgers would you like?");
		numberOfCheesburgers = keyboard.nextDouble();
		
		// How many Sodas
		System.out.print("How many sodas would you like?");
		numberOfSodas = keyboard.nextDouble();
		
		// How many Fries
		System.out.print("How many fries would you like?");
		numberOfFries = keyboard.nextDouble();
		
		//Consume the remaining newline
		keyboard.nextLine();
		
		// Ask for customers Name
		System.out.print("What is the name on the order?");
		name = keyboard.nextLine();
		
		// Calulation
		totalHamburger = numberOfHamburgers * costOfHamburger;
		totalCheeseburger = numberOfCheesburgers * costOfCheeseburger;
		totalSoda = numberOfSodas * costOfSoda;
		totalFry = numberOfFries * costOfFry;
		totalCost = totalHamburger + totalCheeseburger + totalSoda + totalFry;
		String upper = name.toUpperCase();
		
		//Display with %f
		System.out.printf("\nThe total cost of the order is $%,.2f. Order for %s.\n",totalCost,upper);
	}
}