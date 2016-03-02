import java.util.Scanner;

public class AreaClassProgram {
	
	public static void main(String[] args)
	{
		
		double rad;
		int height;
		int width;
		double Height;
		
		Scanner keyboard = new Scanner(System.in);
		
		
			//Ask measurements
		System.out.println("Please enter a radius.");
		rad = keyboard.nextDouble();
	
			//Area of a circle
		System.out.println("The area of a circle with a " +
			"radius of " + rad + " is " + MyMath.getArea(rad));
		
		
			//Ask measurements
		System.out.println("Please enter a height.");
		height = keyboard.nextInt();
		
		System.out.println("Please enter a width.");
		width = keyboard.nextInt();
		
			//Area of a rectangle
		System.out.println("The area of a rectangle with a " +
			"hieght of " + height +  " and a width of " + width +
			" is " + MyMath.getArea(height,width));
		
			//Ask measurements
		System.out.println("Please enter a radius.");
		rad = keyboard.nextDouble();
		
		System.out.println("Please enter a height.");
		Height = keyboard.nextDouble();
		
			//Area of a cylinder
		System.out.println("The area of a cylinder with a " +
			"radius of " + rad + " and a height of " + 
			Height + " is " + MyMath.getArea(rad, Height));
		
		keyboard.close();
		
	}
}
