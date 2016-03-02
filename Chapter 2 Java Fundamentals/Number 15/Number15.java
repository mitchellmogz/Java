import java.util.Scanner; // Needed for the Scanner class

// Programming Challenge Number 15

public class Number15
{
	public static void main(String[] args)
	{
		
		double sugar;
		double butter;
		double flour;
		double cookies;
		double sugarTotal;
		double butterTotal;
		double flourTotal;
		
		sugar = 0.03125;
		butter = 0.02084;
		flour = 0.05729;
		
		// Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Number of cookies
		System.out.print("How many cookies do you want to make?");
		cookies = keyboard.nextDouble();
		
		//Calculations
		sugarTotal = cookies * sugar;
		flourTotal = cookies * flour;
		butterTotal = cookies * butter;
		
		//Display Ingredients
		System.out.printf("\nYou will need %.2f cups of sugar to make %.0f cookies\n",sugarTotal,cookies);
		System.out.printf("You will need %.2f cups of butter to make %.0f cookies\n",butterTotal,cookies);
		System.out.printf("You will need %.2f cups of flour to make %.0f cookies\n",flourTotal,cookies);
	}
}