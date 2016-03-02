import java.util.Scanner;
// Challenge Number 12

public class Number12
{
	public static void main(String[] args)
	{
		String city;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// Number of Males
		System.out.print("\nWhat is your favorite city?");
		city = keyboard.nextLine();
		
		// Calulation
		String message = city;
		String upper = city.toUpperCase();
		String lower = city.toLowerCase();
		char letter = city.charAt(0);
		int stringSize = city.length();
		
		//Display with %f
		System.out.printf("\nYour favorite city is %s.",message);
		System.out.printf("\nYour favorite city in upper case is %s.",upper);
		System.out.printf("\nYour favorite city in lower case is %s.",lower);
		System.out.printf("\nThe first letter of your favorite city is %s.",letter);
		System.out.printf("\nThere are %s characters in %s",stringSize, city);	
	}
}