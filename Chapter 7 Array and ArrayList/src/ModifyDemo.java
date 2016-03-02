import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// This program uses the Validate class's sequential search method.

public class ModifyDemo
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Henry Pichardo 	5/10/12\n");
		
		int accountNum;
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Create an object from the Validate class.
		Modify acc = new Modify();
		
		// Get the charge account number from the user.
		System.out.print("Enter you charge account number: ");
				accountNum = keyboard.nextInt();
		
		// Determine whether the account number entered is valid.
		if (acc.isAccounts(accountNum))
			System.out.println("That's a valid acount number.");
		else
			System.out.println("That's an INVALID account number.");

	}
}