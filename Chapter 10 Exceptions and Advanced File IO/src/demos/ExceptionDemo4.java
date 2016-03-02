package demos;
import java.io.*;
import java.util.Scanner;

public class ExceptionDemo4 {

		public static void main(String[] args) throws FileNotFoundException
		{
			
				//checked vs unchecked
			
			
				//unchecked are derived from Error or Runtime exception
				//classes derived from Error they are critical errors
				//runtimeexception they are results from programmming errors these can be avoided
				//Unchecked shouoldnt be handled
			
			
			BankAccountDemo b1 = new BankAccountDemo();
			
			b1.setBalance(-1.5);
			
				//Checked
				//ALL exceptions that do not derive from Error or Runtime
				//we should handle this accordingly
			displayFile("me.txt");
			
				
			
			
			
			
			
				//manually throwing an exception
				//can manually throw any of the built in exception types
				//manually throw a custom exception type == one you made
			
			
			
			
		}
		
			//If we have a method that can throw a checked exception we must handle it or
			//it must have a throws clause in the method header
		
		public static void displayFile(String name) throws FileNotFoundException
		{
			/*
				//OPTION ONE!!!
				//open file
			File file = new File(name);
			Scanner inputFile = null;
			try
			{
				inputFile =  new Scanner(file);
				while (inputFile.hasNext())
				{
					System.out.println(inputFile.nextLine());
				}
			}
			catch(FileNotFoundException ex)
			{
				System.out.println(ex.getMessage());
			}

				//close the file
			inputFile.close();
			*/
			
			
				//OPTION TWO!!!
				//open file
			File file = new File(name);
			Scanner inputFile = new Scanner(file);
			
			while(inputFile.hasNext())
			{
				System.out.println(inputFile.nextLine());
			}
			
				//close the file
			inputFile.close();
			
			
		}
	
}
