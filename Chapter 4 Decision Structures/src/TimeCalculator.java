import java.util.Scanner; 
public class TimeCalculator {

	public static void main(String[] args)
	{
			//Variables
		int num;
		int calc;
			//Scanner Object
		Scanner keyboard = new Scanner(System.in);
				
			//Ask for a number between 1-10
		System.out.println("Please enter a number of seconds.\n");
		num = keyboard.nextInt();
		
			//If else statement
		if (num < 60)
		{
			System.out.println("Please enter a number higher than " + num + ".");
		}
		else if (num <= 3599)
		{
			calc = num / 60;
			System.out.println("There are " + calc + " minute(s) in " + num + " seconds.");
		}
		else if (num <= 86499)
		{
			calc = num / 3600;
			System.out.println("There are " + calc + " hours(s) in " + num + " seconds.");
		}
		
		else if (num <= 2147483647);
		{
			calc = num / 86400;
			System.out.println("There are " + calc + " day(s) in " + num + " seconds.");
		}
	}
	
}
