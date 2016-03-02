import java.util.Scanner;
public class TestScoreDriver {
	
	public static void main (String[] args) 
		{
			//Variables
		double test1;
		double test2;
		double test3;
		
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Get the employee name.
		System.out.print("Enter the first test score. ");
		test1 = keyboard.nextDouble();
		
			//Get employee ID number.
		System.out.print("Enter the second test score. ");
		test2 = keyboard.nextDouble();
		
			//Get employee Hourly Pay Rate.
		System.out.print("Enter the third test score. ");
		test3 = keyboard.nextDouble();
		
			//Creating an instance
		TestScore firstAv = new TestScore(test1, test2, test3);
		
		//Output
		System.out.println();
		System.out.println("The first test score is: " + firstAv.getTest1());
		System.out.println("The second test score is: " + firstAv.getTest2());
		System.out.println("The third test score is: " + firstAv.getTest3());
		System.out.println("The average of the three test is: " + firstAv.getGross());
		}
}