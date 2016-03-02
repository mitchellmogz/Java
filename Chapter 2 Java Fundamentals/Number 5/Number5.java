import java.util.Scanner;
// Challenge Number 5

public class Number5
{
	public static void main(String[] args)
	{
		int number;
		int calorie;
		int total;
		
		calorie = 75;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// How many coookies
		System.out.print("How many cookies did you eat?");
		number = keyboard.nextInt();
		
		// Calulation
		total = (int)(number * calorie);
		
		// Display total calorie intake
		System.out.println("\n" + "Your calorie intake is " + total);
	}
}