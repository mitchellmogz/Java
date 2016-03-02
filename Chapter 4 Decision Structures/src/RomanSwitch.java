import java.util.Scanner;
public class RomanSwitch {

	public static void main (String[] args)
	
	{
			//Variables
		int num;
		
			//Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
				
			//Ask the user to enter a number between 1-10
		System.out.println("Enter a number between 1 - 10.\n");
		num = keyboard.nextInt();
		
			//Determine which number was entered
		switch (num)
		{
		
		case 1:
			System.out.println("1 is equal to I");
			break;
			
		case 2:
			System.out.println("2 is equal to II");
			break;
			
		case 3:
			System.out.println("3 is equal to III");
			break;
			
		case 4:
			System.out.println("4 is equal to IV");
			break;
			
		case 5:
			System.out.println("5 is equal to V");
			break;
			
		case 6:
			System.out.println("6 is equal to VI");
			break;
			
		case 7:
			System.out.println("7 is equal to VII");
			break;
			
		case 8:
			System.out.println("8 is equal to VIII");
			break;
			
		case 9:
			System.out.println("9 is equal to IX");
			break;
		
		case 10:
			System.out.println("10 is equal to X");
			break;	
			
		default:
			System.out.println("The number you entered was not in range.");
		}
	}
	
}
