package Number5;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class PayrollDriver {

		public static void main(String[] args) throws IOException
		{
			
				//variables
			String name = "";
			int id = 0;
			double wage = 0;
			int hours = 0;
			
				//Scanner
			Scanner keyboard = new Scanner(System.in);
			
				//DecimalFormat
			DecimalFormat bender = new DecimalFormat("0.00");
			
				//instance
			PayrollClass guy = new PayrollClass(name, id, wage, hours);
			
				//Ask for input
			try
			{
				System.out.println("Please enter your name.");
				name = keyboard.nextLine();
				guy.setName(name);	
			}
			catch(NameException ex)
			{
				System.out.println(ex.getMessage());
			}
			
			
			try
			{
					System.out.println("Please enter your ID number.");
					id = keyboard.nextInt();
					guy.setId(id);
			}
			catch (IDException ex)
			{
				System.out.println(ex.getMessage());
			}
			
			try
			{
				System.out.println("Please enter your hourly wage.");
				wage = keyboard.nextDouble();
				guy.setWage(wage);
			}
			catch (WageException ex)
			{
				System.out.println(ex.getMessage());
			}
			
			try
			{
				System.out.println("Please enter the number of hours worked.");
				hours = keyboard.nextInt();	
				guy.setHours(hours);
			}
			catch (HoursException ex)
			{
				System.out.println(ex.getMessage());
			}
				//close
			keyboard.close();
			
				//check
			if(name.equals("") || id < 0 || hours < 0 || hours > 84 || wage < 0 || wage > 25)
			{
				System.out.println("Please reset program and try again.");
				
			}
			
			else
			{	
				//Display results
			System.out.println(name + "'s ID number is " + id + "\n" + name + " makes $" + bender.format(wage) + " and worked " + hours + " hours.");
			System.out.println(name + " made $" + bender.format(wage*hours) + " total." );
			
			}
		}
	
}
