import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class InnerClassDemo
{

	public static void main(String[] args) throws IOException
	{
			//Variables
		String filename;
		String description;
		int number;
		double whole;
		double retail;
		int quantity;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//DecimalFormat
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		//Get file name
		System.out.println("Enter a name for the file.");
		filename = keyboard.nextLine();
		
			//Input item 1
		System.out.println("Enter the item's description.");
		description = keyboard.nextLine();
		
		System.out.println("Enter the item number.");
		number = keyboard.nextInt();
		
		System.out.println("Enter the item's wholesale price.");
		whole = keyboard.nextDouble();
		
		System.out.println("Enter the item's retail price.");
		retail = keyboard.nextDouble();
		
		System.out.println("Enter the quanity of items bought.");
		quantity = keyboard.nextInt();
		
			//Open the file
		PrintWriter outputFile = new PrintWriter("C:\\Users\\mitch\\Desktop\\FilesWriter\\" + filename + ".txt");
		
			//Create a RetailItem object
		RetailItem item = new RetailItem(description, number, whole, retail);
		
			//Create a Cash Register
		CashRegister price = new CashRegister(quantity, item);
		
			//Display item
		System.out.println(item);
		
		
				//Write the name to the file
			outputFile.println("SALES RECEIPT");
			outputFile.println("Description: " + description);
			outputFile.println("Retail Price: $" + retail);
			outputFile.println("Quantity: " + quantity);
			outputFile.println("Subtotal: $" + dollar.format(CashRegister.getSubtotal()));
			outputFile.println("Sales Tax: $" + dollar.format(CashRegister.getTax()));
			outputFile.println("Total: $" + dollar.format(CashRegister.getTotal()));
			
			
				//Close the file
			outputFile.close();
			
				//Close keyboard
			keyboard.close();
		
			System.out.println("File has been written to and saved.");
		
	}
	
}
