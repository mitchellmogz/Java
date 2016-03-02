import java.util.Scanner;

public class Rainfall
{

	public static void main(String[] args)
	{
					//Variables
				int year;
				final int months = 12;
				int totalMonths = 0;
				double monthlyRain;
				double totalRain = 0;
				double averageRain;
				
					//Scanner Object
				Scanner keyboard = new Scanner(System.in);
						
					//Ask for the number years
				System.out.println("Please enter the number of years.");
				year = keyboard.nextInt();
				
					//Validate
				while (year <= 0)
				{
					System.out.println("Please enter a number higher than 0");
					year = keyboard.nextInt();
				}
				
					//Ask for monthly rainfall
				System.out.println("Enter the monthly rainfall for each month.");
				
				for(int years = 0; years < year; years++)
				{
					for (int month = 1; month < months + 1; month++)
					{
						switch(month)
						{
						
						case 1:
							System.out.println("January Rainfall: ");
							break;
							
						case 2:
							System.out.println("Febuary Rainfall: ");
							break;
						
						case 3:
							System.out.println("March Rainfall: ");
							break;
							
						case 4:
							System.out.println("April Rainfall: ");
							break;
							
						case 5:
							System.out.println("May Rainfall: ");
							break;
							
						case 6:
							System.out.println("June Rainfall: ");
							break;
							
						case 7:
							System.out.println("July Rainfall: ");
							break;
							
						case 8:
							System.out.println("August Rainfall: ");
							break;
							
						case 9:
							System.out.println("September Rainfall: ");
							break;
							
						case 10:
							System.out.println("October Rainfall: ");
							break;
						
						case 11:
							System.out.println("November Rainfall: ");
							break;
							
						case 12:
							System.out.println("December Rainfall: ");
							break;
							
						}	
						
						monthlyRain = keyboard.nextInt();
						totalRain += monthlyRain;
						
					}
							
					totalMonths += months;
					
				}
				
				averageRain = totalRain / totalMonths;
				
				// Newline1
				System.out.println("");
				// Display rainfall data
				System.out.println("Total Months: " + totalMonths + "\nTotal Rainfall: " + totalRain + " inches" +
						"\nAverage Rainfall: " + averageRain + " inches");
				
				keyboard.close();
					
		
	}

}
