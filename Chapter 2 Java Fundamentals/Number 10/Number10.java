import java.util.Scanner;
// Challenge Number 10

public class Number10
{
	public static void main(String[] args)
	{
		double firstTest;
		double secondTest;
		double thirdTest;
		double totalThem;
		double averageThem;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// First Test Score
		System.out.print("\nWhat was your first test score?");
		firstTest = keyboard.nextDouble();
		
		// Second Test Score
		System.out.print("\nWhat was your second test score?");
		secondTest = keyboard.nextDouble();
		
		// Third Test Score
		System.out.print("\nWhat was your third test score?");
		thirdTest = keyboard.nextDouble();
		
		// Calulation
		totalThem = firstTest + secondTest + thirdTest;	
		averageThem = totalThem / 3.0;
		
		
		//Display with %f
		System.out.printf("\nYou got a %.2f on your first test.",firstTest);
		System.out.printf("\nYou got a %.2f on your second test.",secondTest);
		System.out.printf("\nYou got a %.2f on your third test.",thirdTest);
		System.out.printf("\nYour average you got is %.2f on all three tests.",averageThem);
	}
}