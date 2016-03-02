import java.util.Scanner;
// Challenge Number 13

public class Number13
{
	public static void main(String[] args)
	{
		double mealCharge;
		double mealTax;
		double mealTaxTotal;
		double tipTaxTotal;
		double tipTax;
		double totalTax;
		double total;
		double mealChargeTax;
		
		mealTax = 0.075;
		tipTax = 0.18;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// How much is the total
		System.out.print("How much was your meal total?");
		mealCharge = keyboard.nextDouble();
		
		// Calulation
		mealTaxTotal = mealCharge * mealTax;
		mealChargeTax = mealTaxTotal + mealCharge;
		tipTaxTotal = mealChargeTax * tipTax;
		totalTax = mealTaxTotal + tipTaxTotal;
		total = totalTax + mealCharge;
		mealTax = mealTax * 100;
		tipTax = tipTax * 100;
		
		//Display with %f
		System.out.printf("\nYour Meal Cost $%,.2f",mealCharge);
		System.out.printf("\nYour Meal Tax is %.1f Percent",mealTax);
		System.out.printf("\nYour Tip is %.0f Percent",tipTax);
		System.out.printf("\nYour Meal Tax is $%,.2f",mealTaxTotal);
		System.out.printf("\nYour Tip is $%,.2f",tipTaxTotal);
		System.out.printf("\nYour Tip plus Tax is $%,.2f",totalTax);
		System.out.printf("\nYour total comes to $%,.2f",total);
	}
}