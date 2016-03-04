import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Sales
{

	public static void main(String[] args) throws IOException
	{
				//Variables
			String filename;
			double sales;
			double totalSales = 0;
				
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
			//Decimal Format
			DecimalFormat bender = new DecimalFormat("###,###,##0.00");
			
				//Get file name
			System.out.println("Enter a name for the file.");
			filename = keyboard.nextLine();
				
				//Ask for the sales of this week
			System.out.println("We will be entering the sales we made this week.");
			System.out.println("There will be five days to enter an amount.");
			
				//Open the file
			PrintWriter outputFile = new PrintWriter("C:\\Users\\mitch\\Desktop\\FilesWriter\\" + filename + ".txt");
				
			for (int days = 1; days <= 5; days++)
			{
				System.out.println("Please enter the amount of money made on day " + days + ".");
				sales = keyboard.nextDouble();
				
				if (sales < 0)
					{
					System.out.println("You cannot enter a negative number.");
					sales = keyboard.nextDouble();
					}
				
				
				totalSales = totalSales + sales;
				
				//Write the name to the file
				outputFile.println("Day " + days + " sales were $" + bender.format(sales)
				+ ". Total sales are $" + bender.format(totalSales) + ".\n");
				
			}
			
			//Write the name to the file
			outputFile.println("The total sales this week are $" + bender.format(totalSales) + ".");

				//Close the file
			outputFile.close();
				//Close keyboard
			keyboard.close();
			
			System.out.println("File has been written to and saved.");
	}
				
}
