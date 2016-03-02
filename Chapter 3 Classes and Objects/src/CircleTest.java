import java.util.Scanner;
public class CircleTest {
	
	public static void main (String[] args) 
	{
			//Variables
		double testRadius;
		double testDiameter;
		double testCircumference;
		double testArea;
		final double testPI = 3.14159;
				
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Get the radius.
		System.out.print("Enter an amount for the radius. ");
		testRadius = keyboard.nextDouble();
		
			//Calculations
		testArea = testPI * testRadius * testRadius;
		testDiameter = testRadius * 2;
		testCircumference = 2 * testPI * testRadius;
		
		
			//Creating an instance
		Circle firstCircle = new Circle(testRadius, testDiameter, testCircumference, testArea, testPI);
		
			//Output
		System.out.println();
		System.out.println("You entered a Radius of: " + firstCircle.getRadius());
		System.out.println("You entered a Diameter of: " + firstCircle.getDiameter());
		System.out.println("You entered a Circumference of: " + firstCircle.getCircumference());
		System.out.println("The area of the circle is: " + firstCircle.getArea());
	}
}