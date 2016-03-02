import java.util.Scanner; 
public class Roman {

	public static void main(String[] args)
	{
			//Variables
		int num;
		
			//Scanner Object
		Scanner keyboard = new Scanner(System.in);
				
			//Ask for a number between 1-10
		System.out.println("Please enter a number between 1-10.\n");
		num = keyboard.nextInt();
		
			//If else statement
		if (num < 1)
			System.out.println("Please enter a number higher than 1");
		
		else if (num == 1)
			System.out.println("1 is equal to I");
		
		else if (num == 2)
			System.out.println("2 is equal to II");
		
		else if (num == 3)
			System.out.println("3 is equal to III");
		
		else if (num == 4)
			System.out.println("4 is equal to IV");
		
		else if (num == 5)
			System.out.println("5 is equal to V");
		
		else if (num == 6)
			System.out.println("6 is equal to VI");
		
		else if (num == 7)
			System.out.println("7 is equal to VII");
		
		else if (num == 8)
			System.out.println("8 is equal to VIII");
		
		else if (num == 9)
			System.out.println("9 is equal to IX");
		
		else if (num == 10)
			System.out.println("10 is equal to X");
		
		else
			System.out.println("Please enter a number lower then 10");
		
	}
	
}
