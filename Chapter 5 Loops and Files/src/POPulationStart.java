import java.text.DecimalFormat;
import java.util.Scanner;

public class POPulationStart
{

	public static void main(String[] args)
	{
				//Variables
			double start;
			double per;
			double days;
			double num = 0;
			double generation = 0;
			double generationAdd = 0;
				
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
				
				//Decimal Format
			DecimalFormat bender = new DecimalFormat("0");
	
				//Ask for the number of Organisms
			System.out.println("How many organisms are we starting with?\n");
			start = keyboard.nextDouble();
				
			while (start <= 1)
			{
				System.out.println("Please enter a number higher than 2.");
				start = keyboard.nextInt();
			}
			
				//Ask for the number of ADI
			System.out.println("What is their average daily increase?\n");
			per = keyboard.nextDouble();
				
			while (per < 0)
			{
				System.out.println("Please enter a number higher than 0.");
				per = keyboard.nextInt();
			}
			
			
			
			//Ask for the number of days
			System.out.println("How many days are they going to multiply?\n");
			days = keyboard.nextDouble();
				
			while (days < 1)
			{
				System.out.println("Please enter a number higher than 1.");
				start = keyboard.nextInt();
			}
			
				//instance
			POPulation firstHuman = new POPulation(start, per, days);
				
			
			while (num < days)
			{
				num++;
				
				generation = firstHuman.getStart() + generationAdd;
				
				System.out.println("Day " + bender.format(num) + ": There are " 
					+ bender.format(generation) + " organisms.  The percent growth is " 
					+ bender.format(firstHuman.getPer()) + "%.");
			
				 
				generationAdd = firstHuman.getStart() * firstHuman.getIncrease();
				
				
				System.out.println("The number of added orgisms is " + bender.format(generationAdd) + ".\n");
			
			}
			
			keyboard.close();
			
	}
				
}
