import java.util.Scanner;

public class ItemDemo {

	public static void main(String[] args) {
		
			//Variable
		String description;
		int number;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		
			//Enter
		System.out.println("Please enter a description.");
		description = keyboard.nextLine();
		
		System.out.println("Please enter a number.");
		number = keyboard.nextInt();
		
		
			//create new object
		Item screwDriver = new Item(description, number);
		
			//Copy constructor
		Item wrench = new Item(screwDriver);

			//Display Both Items
		System.out.println("\nScrew Driver: \n" + screwDriver);
		System.out.println("Wrench: \n" + wrench);
		
			//confirm
		if (screwDriver == wrench)
		{
	         System.out.println("The screwDriver and wrench "
	                + "variables reference the same object.");
	      }
	      else
	      {
	         System.out.println("The screwDriver and wrench "
	              + "variables reference different objects.");
	      }
		
		keyboard.close();
		
	}

}
