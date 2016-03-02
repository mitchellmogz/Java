import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args)
	{
			//Variables
		int num;
		int sum = 0;
		int start = 1;
			//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
			//Enter positive number
		System.out.println("Please enter a positive nonzero integer.\n");
		num = keyboard.nextInt();
		
		
			//Validate the input
		while (num <= 0)
		{
			System.out.println("Please enter a postive nonzero intenger.\n");
			num = keyboard.nextInt();
			
		}
		while (start <= num)
		{
			sum = sum + start;
			
			System.out.println(start++);
			
			
		}
		
		System.out.println("The sum of all the numbers is " + sum);
		keyboard.close();
	}
	
}
