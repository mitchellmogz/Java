import java.util.Scanner;

public class GeometryTeacher {
	
	public static void main(String[] args)
	{
		
		double rad;
		int length;
		int width;
		double base;
		double height;
		int menu;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//Main Menu
		System.out.println("Geomentry Calculator\n1. Calculate the Area of a Circle\n2. " + 
				"Calculate the Area of a Rectangle\n3. Caclulate the Area of a Triangle\n4. Quit\n\n" +
				"Enter your choice (1-4):");
		menu = keyboard.nextInt();
		
		switch (menu)
		{
		
		case 1:
			{
			System.out.println("Calculate the Area of a Cirlce\n");
			//Ask measurements
			System.out.println("Please enter a radius.");
			rad = keyboard.nextDouble();
			
				//Verify
			while (rad < 0)
				{
				System.out.println("Please enter a positve number.");
				rad = keyboard.nextDouble();
				}
			//Area of a circle
			System.out.println("The area of a circle with a " +
				"radius of " + rad + " is " + Geometry.getArea(rad));
			}
			break;
			
		case 2:
			{
			System.out.println("Calculate the Area of a Rectangle\n");
			
				//Ask Height
			System.out.println("Please enter a length.");
			length = keyboard.nextInt();
			
				//Verify
			while (length < 0)
			{
				System.out.println("Please enter a positive number.");
				length = keyboard.nextInt();
			}
			
				//Ask Width
			System.out.println("Please enter a width.");
			width = keyboard.nextInt();
			
				//Verify
			while (width < 0)
			{
				System.out.println("Please enter a positve number");
				width = keyboard.nextInt();
			}
			
				//Area of a rectangle
			System.out.println("The area of a rectangle with a " +
				"hieght of " + length +  " and a width of " + width +
				" is " + Geometry.getArea(length,width));
			}
			break;
			
		case 3:
		{
			System.out.println("Calculate the Area of a Triangle\n");
		
				//Ask Height
			System.out.println("Please enter a base.");
			base = keyboard.nextInt();
		
				//Verify
			while (base < 0)
		{
			System.out.println("Please enter a positive number.");
			base = keyboard.nextInt();
		}
		
				//Ask Width
			System.out.println("Please enter a height.");
			height = keyboard.nextInt();
		
				//Verify
			while (height < 0)
			{
				System.out.println("Please enter a positve number");
				height = keyboard.nextInt();
			}
		
				//Area of a rectangle
			System.out.println("The area of a triangle with a " +
					"base of " + base +  " and a height of " + height +
					" is " + Geometry.getArea(base,height));
			}
		break;
		
		case 4:
		{
			break;
		}
		
		default:
		{
			System.out.println("You have entered an invalid number.");
		}
		}
		keyboard.close();	
	}
}
