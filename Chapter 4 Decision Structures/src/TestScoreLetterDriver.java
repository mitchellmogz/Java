import java.text.DecimalFormat;
import java.util.Scanner;
public class TestScoreLetterDriver {
	
	public static void main (String[] args) 
		{
			//Variables
		double test1;
		double test2;
		double test3;
		
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Decimal Format
		DecimalFormat formatter = new DecimalFormat("0");
		
			//Get the first test score.
		System.out.print("Enter the first test score. ");
		test1 = keyboard.nextDouble();
		
			//Get the second test score.
		System.out.print("Enter the second test score. ");
		test2 = keyboard.nextDouble();

			//Get the third test score.
		System.out.print("Enter the third test score. ");
		test3 = keyboard.nextDouble();
		
			//Creating an instance
		TestScoreLetter firstTest = new TestScoreLetter(test1, test2, test3);
		
			//Output
		if (firstTest.getGross() >= 90 )
		{
			System.out.println("\nThe average of the tests are " 
				+ formatter.format(firstTest.getGross()) + " A");
		}
		else if (firstTest.getGross() >= 80)
		{
			System.out.println("\nThe average of the tests are " 
				+ formatter.format(firstTest.getGross()) + " B");
		}
		else if (firstTest.getGross() >= 70)
		{
			System.out.println("\nThe average of the tests are " 
				+ formatter.format(firstTest.getGross()) + " C");
		}
		else if (firstTest.getGross() >= 60)
		{
			System.out.println("\nThe average of the tests are " 
				+ formatter.format(firstTest.getGross()) + " D");
		}
		else if (firstTest.getGross() < 60)
		{
			System.out.println("\nThe average of the tests are " 
				+ formatter.format(firstTest.getGross()) + " F");
		}
		
	}
}