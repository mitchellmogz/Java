import java.util.Scanner;

public class ChargeAccountValidation {

	public static void main(String[] args)
	{

			//Variable
		char a;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		do{
			//Display
		System.out.print("Please enter an account number: ");
		int number = keyboard.nextInt();
		
		
		if ( ChargeAccount.getValidNumbers(number) == true ) 
		{
			System.out.println("That number is valid.");			
		} 
		else 
		{
			System.out.println("That number is invalid.");
		}
		
		System.out.println("Would you like to try again?");
		a = keyboard.next().charAt(0);
		}while (a == 'y' || a == 'Y');
		
		keyboard.close();
		
	}
	
}
