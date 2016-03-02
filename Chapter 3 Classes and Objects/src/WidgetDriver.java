import java.util.Scanner;
public class WidgetDriver {
	
	public static void main (String[] args) 
	{
			//Variables
		double testWidget;
		double testGross;
		
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Get the employee name.
		System.out.print("Enter the amount of widget you want. ");
		testWidget = keyboard.nextDouble();
		
			//Calculations
		testGross = testWidget / 160;
		
			//Creating an instance
		Widget firstWd = new Widget(testWidget, testGross);
		
		//Output
		System.out.println();
		System.out.println("You entered " + firstWd.getWidget() + " widget(s)." );
		System.out.println("It would take: " + firstWd.getGross() + 
							" day(s) to make " + firstWd.getWidget() + " widget(s)" );
	}
}