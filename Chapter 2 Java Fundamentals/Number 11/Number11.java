import java.util.Scanner;
// Challenge Number 11

public class Number11
{
	public static void main(String[] args)
	{
		double males;
		double females;
		double total;
		double averageMale;
		double averageFemale;
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// Number of Males
		System.out.print("\nHow many males are there?");
		males = keyboard.nextDouble();
		
		// Number of Females
		System.out.print("\nHow many females are there?");
		females = keyboard.nextDouble();
		
		// Calulation
		total = males + females;
		averageMale = males / total;
		averageFemale = females / total;
		averageMale = averageMale * 100;
		averageFemale = averageFemale * 100;
		
		//Display with %f
		System.out.printf("\nThere are %.0f males.",males);
		System.out.printf("\nThere are %.0f females.",females);
		System.out.printf("\nThere are %.0f total people.",total);
		System.out.printf("\nThe percent of males are %.2f Percent.",averageMale);
		System.out.printf("\nThe percent of females are %.2f Percent.",averageFemale);	
	}
}