import java.util.Scanner;
// Challenge Number 8

public class Number8
{
	public static void main(String[] args)
	{
		double amountPurchase;
		double total;
		double totalTax;
		double countyTax;
		double stateTax;
		double stateTaxTotal;
		double countyTaxTotal;
		
		countyTax = 0.02;
		stateTax = 0.055;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// How much is the total
		System.out.print("What is your total?");
		amountPurchase = keyboard.nextDouble();
		
		// Calulation
		stateTaxTotal = amountPurchase * stateTax;
		countyTaxTotal = amountPurchase * countyTax;
		total = amountPurchase + stateTaxTotal + countyTaxTotal;
		totalTax = stateTaxTotal + countyTaxTotal;
		countyTax = (int)(2);
		stateTax = (double)(5.5);	
		
		
		//Display with %f
		System.out.printf("\nYour amount of purchase is $%,.2f",amountPurchase);
		System.out.printf("\nThe State Tax is %.1f Percent",stateTax);
		System.out.printf("\nThe County Tax is %.0f Percent",countyTax);
		System.out.printf("\nYour total State Tax is $%,.2f",stateTaxTotal);
		System.out.printf("\nYour total County Tax is $%,.2f",countyTaxTotal);
		System.out.printf("\nYour total Tax is $%,.2f",totalTax);
		System.out.printf("\nYour total comes to $%,.2f",total);
	}
}