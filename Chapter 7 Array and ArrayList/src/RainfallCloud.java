import java.util.Scanner;
import java.text.DecimalFormat;

public class RainfallCloud {

	public static void main(String[] args)
	{
		
			//Variable
		final int ONE_YEAR = 12;
		
			//create array
		double[] rainfall = new double[ONE_YEAR];
		
			//Decimal
		DecimalFormat bender = new DecimalFormat("###,###,##0.00");
		
			//Get rainfall
		getValues(rainfall);
			
			//Rainfall object
		Rainfall year = new Rainfall(rainfall);
		
			//Display the total
		System.out.println("\nThe total rainfall this year was " + bender.format(year.getTotalRainfall()) + " inches.");
		System.out.println("\nThe average rainfall this year was " + bender.format(year.getAverageRainfall()) + " inches.");
		System.out.println("\nThe highest amount of rainfall this year was " + bender.format(year.getHighest()) + " inches.");
		System.out.println("\nThe lowest amount of rainfall this year was " + bender.format(year.getLowest()) + " inches.");
		
	}
			
		private static void getValues(double[] array)
		{
			
				//Scanner
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter the rainfall for each of the following months.");
			
				//Get input
			for (int index = 0; index < array.length; index++)
			{
				System.out.println("Month " + (index + 1) + ": ");
				array[index] = keyboard.nextDouble();
				
				while (array[index] < 0)
				{
					System.out.println("Please enter a positve number.");
					array[index] = keyboard.nextDouble();
				}
				
			}
			keyboard.close();
		}
		
		
}
