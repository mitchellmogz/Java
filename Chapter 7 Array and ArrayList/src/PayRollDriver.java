import java.util.Scanner;

public class PayRollDriver {

	public static void main(String[] args)
	{
		
			//back to the basic
		Scanner keyboard = new Scanner(System.in);
		
			//Mabye I should cry for help
		int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
		int[] hours = new int[7];
		double[] payRate = new double[7];
		double[] wages = new double[7];
				
			//Fatality Reptile
		for(int index = 0; index < employeeID.length; index++)
		{
			
			System.out.println("Employee Number: " + employeeID[index]);
			
		}
		
			//Hows that novel
		System.out.println("");
		
			//Must be the felling
		
		for(int index = 0; index <= 6; index++)
		{
			
			System.out.println("Employee #" + employeeID[index] + ", please enter the amount of hours worked.");
			hours[index] = keyboard.nextInt();
			while (hours[index] < 0)
			{
				System.out.println("Please enter a positive number.");
				hours[index] = keyboard.nextInt();
			}
			
			
			System.out.println("Employee #" + employeeID[index] + ", please enter your pay rate.");
			payRate[index] = keyboard.nextDouble();
			while (payRate[index] < 6.00)
			{
				System.out.println("Please enter a number higher than 6.00.");
				payRate[index] = keyboard.nextDouble();
			}
			
			System.out.println("Employee #" + employeeID[index] + ", please enter your wages.");
			wages[index] = keyboard.nextDouble();
			
			Payroll zip = new Payroll(hours[index], payRate[index], wages[index]);
			System.out.println(zip.toString());
		}
		
		keyboard.close();
	}
	
}
