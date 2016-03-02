import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame
{

	public static void main(String[] args)
	{
				//Variables
			int ran;
			int num;
			int count = 1;			
			
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
				//Create a Random object
			Random randomNumbers = new Random();
			
			ran = randomNumbers.nextInt();
			
			System.out.println("Guess a number.");
			num = keyboard.nextInt();
			
			while (num != ran)
			{
				while (num < ran)
				{
					System.out.println("Too low, try again.");
					num = keyboard.nextInt();
					count++;
				}
				
				while (num > ran)
				{
					System.out.println("Too high, try again.");
					num = keyboard.nextInt();
					count++;
				}
			}
				
				System.out.println("Wow. It took you " + count + " tries.");
				//Close keyboard
			keyboard.close();
	}
				
}
