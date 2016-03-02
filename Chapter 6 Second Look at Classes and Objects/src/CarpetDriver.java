import java.util.Scanner;

public class CarpetDriver 
{

	public static void main(String[] args) 
	{

	    double cost;

	    	// Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    	// Get the length of the room.
	    System.out.print("Enter the length of room: ");
	    double length = keyboard.nextDouble();

	    	// Get the width of the room.
	    System.out.print("Enter the width of room: ");
	    double width = keyboard.nextDouble();
	    	
	    	// Get the price of the carpet
	    System.out.println("Enter the price per square foot.");
	    cost = keyboard.nextDouble();
	    
	    //close keyboard
	    keyboard.close();

	   		// Create RoomDimension and RoomCarpet objects.
	    RoomDimentions dimentions = new RoomDimentions(length, width);
	    RoomCarpet roomCarpet = new RoomCarpet(dimentions, cost);

	    // Print the object calling the toString
	    System.out.println(roomCarpet);
	}
	
}
