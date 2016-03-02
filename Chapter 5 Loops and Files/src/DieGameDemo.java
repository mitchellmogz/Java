import java.util.Random;
import java.util.Scanner;

public class DieGameDemo
{

	public static void main(String[] args)
	{
				//Variables
			String name;
			int num;
			int unum;
			int comp = 0;
			int score = 0;
			int round = 0;
				
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
				//Create a Random object
			Random randomNumbers = new Random();
			
			num = randomNumbers.nextInt(6) + 1;
			unum = randomNumbers.nextInt(6) + 1;
			
				//Get file name
			System.out.println("Enter a user name for this die game.");
			name = keyboard.nextLine();
			
				//instance
			DieGame user = new DieGame(unum);
			DieGame cpu = new DieGame(num);
				
			while (round < 10)
			{
				if (cpu.getNum() > user.getNum())
				{
					System.out.println("Computer's number is higher.");
					comp++;
					round++;
					
					System.out.println("This is Computer's number: " + cpu.getNum() + "\nThis is " + name + "'s number: " 
							+ user.getNum() + "\nThis was round " + round + ".\n");
					
					cpu.setNum(randomNumbers.nextInt(6) + 1);
					user.setNum(randomNumbers.nextInt(6) + 1);
				}
				else if (cpu.getNum() < user.getNum())
				{
					System.out.println(name + "'s number is higher.");
					score++;
					round++;
					
					System.out.println("This is Computer's number: " + cpu.getNum() + "\nThis is " + name + "'s number: " 
							+ user.getNum() + "\nThis was round: " + round + ".\n");
					
					cpu.setNum(randomNumbers.nextInt(6) + 1);
					user.setNum(randomNumbers.nextInt(6) + 1);
				}
				
				else
				{
					System.out.println("It is a tie.\n");
					cpu.setNum(randomNumbers.nextInt(6) + 1);
					user.setNum(randomNumbers.nextInt(6) + 1);
				}
			}
				System.out.println("There was " + round + " rounds.\nComputer's score was " + comp + ".\n"
						+ name + "'s score was " + score + ".");
				//Close keyboard
			keyboard.close();
			
	}
				
}
