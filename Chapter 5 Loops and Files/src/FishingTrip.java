//295

import java.util.Random;
import java.util.Scanner;

public class FishingTrip
{

	public static void main(String[] args)
	{
				//Variables
			String name;
			int num;
			int score = 0;
			int start = 0;
			int rounds;
			char con;
				
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
				//Create a Random object
			Random randomNumbers = new Random();
			
			num = randomNumbers.nextInt(6) + 1;
			
				//Get user name
			System.out.println("Enter a user name for this fishing game.");
			name = keyboard.nextLine();
			
				//How many rounds
			System.out.println("How many rounds of fishing would you like to play?");
			rounds = keyboard.nextInt();
			
			System.out.println("Hello " + name + "!\nYou have selected to play " + rounds + " rounds.\n");
			
				//instance
			FishingTripClass user = new FishingTripClass(num);
				
			while (start < rounds)
			{
				switch(user.getNum())
				{
				
					case 1:
					{
						System.out.println("You caught a small fish!\n");
						score = score + 1;
						start++;
						System.out.println("Would you like to keep fishing?");
						con = keyboard.next().charAt(0);
					
						user.setNum(randomNumbers.nextInt(6)+1);
						break;
					}
					case 2:
					{
						System.out.println("You did not catch anything this round.\n");
						score = score + 0;
						start++;
						user.setNum(randomNumbers.nextInt(6)+1);
						break;
					}
					case 3:
					{
						System.out.println("You caught an octopus!!!\n");
						score = score + 5;
						start++;
						user.setNum(randomNumbers.nextInt(6)+1);
						break;
					}
					case 4:
					{
						System.out.println("You caught an old boot.\n");
						score = score - 1;
						start++;
						user.setNum(randomNumbers.nextInt(6)+1);
						break;
					}
					case 5:
					{
						System.out.println("You caught a large fish!\n");
						score = score + 2;
						start++;
						user.setNum(randomNumbers.nextInt(6)+1);
						break;
					}
					case 6:
					{
						System.out.println("You caught a turtle!\n");
						score = score + 3;
						start++;
						user.setNum(randomNumbers.nextInt(6)+1);
						break;
					}
				
				}
				
			}
			
				System.out.println(name + "'s total score is " + score + "!");
				
				//Close keyboard
			keyboard.close();
			
	}
				
}
