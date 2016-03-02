import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This is the Validate class, modified.
 */

public class Modify
{
	public final int ARRAY_SIZE = 19;
	public int[] accounts;
	
	
	public boolean isAccounts(int number) throws IOException
	{
		boolean found = false;		// Flag indicating search results.
		int index = 0;				// Index 0 is the starting point of the search.
		
		// Opens the file.
		File file = new File("Charge.txt");
		Scanner inputFile = new Scanner(file);
		
		// Reads the file.
		while (inputFile.hasNext() && index < inputFile.nextInt(index))
		{
			accounts[index] = inputFile.nextInt(index);
			index++;
		}
		
		// Set up the loop to find the correct account number.
		while (!found && index < inputFile.nextInt())
		{
			if (inputFile.nextInt() == number)
				found = true;
			else 
				index++;
			
			// Closes the file.
			inputFile.close();
		}inputFile.close();
		return found;
	}
}