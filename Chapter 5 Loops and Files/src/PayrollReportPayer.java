import java.text.DecimalFormat;
import java.util.Scanner;

public class PayrollReportPayer
{

	public static void main(String[] args)
	{
				//Variables
		    double id;
			double gross;
			double state;
			double federal;
			double fica;
				
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
		
				//Decimal Format
			DecimalFormat bender = new DecimalFormat("###,###,###.00");
			DecimalFormat zoid = new DecimalFormat("0");
			
			//Ask for the employee id
			System.out.println("What is your employee id number?\n");
			id = keyboard.nextDouble();
				
			while (id != 0)
			{
	
				System.out.println("Please enter your gross pay.");
				gross = keyboard.nextDouble();
				
					while (gross < 0)
					{
						System.out.println("Please enter a positive number for your gross pay.");
						gross = keyboard.nextDouble();
					}
				System.out.println("Please enter your state tax.");
				state = keyboard.nextDouble();
				
					while (state > gross)
					{
						System.out.println("Please enter a number lower than your gross.");
						state = keyboard.nextDouble();
					}
				
				System.out.println("Please enter your federal tax.");
				federal = keyboard.nextDouble();
				
					while (federal > gross)
					{
						System.out.println("Please enter a number lower than your gross.");
						federal = keyboard.nextDouble();
					}
				
				System.out.println("Please enter your FICA withholdings.");
				fica = keyboard.nextDouble();
				
					while (fica > gross)
					{
						System.out.println("Please enter a number lower than your gross.");
						fica = keyboard.nextDouble();
					}
				
					while (state + federal + fica > gross)
					{
						System.out.println("You entered a negative amount employee " + zoid.format(id) + ". Please try again.");
						
						
						System.out.println("Please enter your gross pay.");
						gross = keyboard.nextDouble();
						
							while (gross < 0)
							{
								System.out.println("Please enter a positive number for your gross pay.");
								gross = keyboard.nextDouble();
							}
						System.out.println("Please enter your state tax.");
						state = keyboard.nextDouble();
						
							while (state > gross)
							{
								System.out.println("Please enter a number lower than your gross.");
								state = keyboard.nextDouble();
							}
						
						System.out.println("Please enter your federal tax.");
						federal = keyboard.nextDouble();
						
							while (federal > gross)
							{
								System.out.println("Please enter a number lower than your gross.");
								federal = keyboard.nextDouble();
							}
						
						System.out.println("Please enter your FICA withholdings.");
						fica = keyboard.nextDouble();
						
							while (fica > gross)
							{
								System.out.println("Please enter a number lower than your gross.");
								fica = keyboard.nextDouble();
							}
						
						
					}
					
					//instance
				PayrollReport fry = new PayrollReport(gross, state, federal, fica);
				
				System.out.println("Employee " + zoid.format(id) + ":\nYour Gross Pay is: $"
						+ bender.format(fry.getGross()) + ".\nYour State Tax is: $" + bender.format(fry.getState())
						+ ".\nYour Federal Tax is: $" + bender.format(fry.getFederal()) + ".\nYour FICA Withholdings is: $"
						+ bender.format(fry.getFica()) + ".\nYour Net Pay is: $" + bender.format(fry.getNet()) + ".\n");
				
				System.out.println("Please enter another id number or enter 0 to quit.");
				id = keyboard.nextDouble();
			}
		
			System.out.println("Good-Bye.");
				//Close keyboard
			keyboard.close();
			
	}
				
}
