import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Pennies
{

	public static void main(String[] args) throws IOException
	{
				//Variables
			double salary = 0.01;
			double totalSalary = 0.01;
			int numDays;
			int days = 1;
			
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
				//Decimal Format
			DecimalFormat formatter = new DecimalFormat("###,###,###,###,##0.00");
				
				//Ask for the number of Days
			System.out.println("How many days did you work?\n");
			numDays = keyboard.nextInt();
				
			while (numDays <= 0)
			{
				System.out.println("Please enter a valid number of days.\n");
				numDays = keyboard.nextInt();
			}
			
			System.out.println("You worked " + numDays + ", making a penny the first day and it double every day.");
				
			while (numDays > 0)
			{
				System.out.println("Day " + days + "  You made $" + formatter.format(salary) + "  For a total of $" 
						+ formatter.format(totalSalary));
			salary = salary * 2;
			totalSalary = totalSalary + salary;
			days++;
			numDays--;
			}

				//Close keyboard
			keyboard.close();
	}
				
}
