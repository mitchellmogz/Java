package demos;
import java.io.*;

public class ExceptionDemo5 {

		public static void main(String[] args) throws IOException
		{
			
				//Create and demo a custom exception class
				//Do that by extending exception or one of its sub classes
			BankAccountDemo2 b1 = new BankAccountDemo2();
			
			
			
			try
			{
				b1.setBalance(-5);
			}
			catch(NegativeBalanceDemo ex)
			{
				System.out.println(ex.getMessage());
			}
			
				//Advanced topic
				//Writing to binary Files
			int[] numbers = {1,2,3,4,5};
			
			FileOutputStream fstream = new FileOutputStream("MyInfo.dat");	//open file
			DataOutputStream outputFile = new DataOutputStream(fstream);	//write to
			
			for (int i = 0; i < numbers.length; i++)
			{
				outputFile.writeInt(numbers[i]);
			}
			
			outputFile.close();
			System.out.println("Successfully created binary file.");
				//Reading from binary files

			FileInputStream fstream2 = new FileInputStream("MyInfo.dat");
			DataInputStream inputFile = new DataInputStream(fstream2);
			
			boolean endOfFile = false;
			int num;
			
			System.out.println("Reading the file.");
			
			while(!endOfFile)
			{
				try
				{
					num = inputFile.readInt();
					System.out.println("The number is " + num);
				}
				catch(EOFException ex)
				{
					endOfFile = true;
				}
			}
			inputFile.close();
			System.out.println("Done.");
			
		}
	
}
