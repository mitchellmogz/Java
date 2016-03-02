import java.util.Scanner;
// Challenge Number 9

public class Number9
{
	public static void main(String[] args)
	{
		double milesDriven;
		double gasUsed;
		double milesPerGal;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// How many miles driven
		System.out.print("\nHow many miles did you drive?");
		milesDriven = keyboard.nextDouble();
		
		// How many gallons used
		System.out.print("\nHow many gallons of gas did you use?");
		gasUsed = keyboard.nextDouble();
		
		// Calulation
		milesPerGal = milesDriven/gasUsed;	
		
		
		//Display with %f
		System.out.printf("\nYou get %.2f miles per gallon.",milesPerGal);
	}
}