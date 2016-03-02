import java.util.Scanner;
import java.io.*;


public class ArrayDemo5 {

	public static void main(String[] args)throws IOException
	{
		int[] numbers = {10,20,30,40,50};
		
		int[] inputArray = new int[5];
		
			//arrays and files output
		PrintWriter pw = new PrintWriter("array.txt");
		
		for(int i : numbers)
		{
			pw.println(i);
		}
		pw.close();
		
			
		
			//arrays and file input
		File file = new File("array.txt");
		
		Scanner inputFile = new Scanner(file);
		
		int counter = 0;
		
		while(inputFile.hasNext() && counter < inputArray.length)
			{
				inputArray[counter] = inputFile.nextInt();
				counter++;
			}
		inputFile.close();
		
		for(int i : inputArray)
		{
			System.out.println(i);
		}
		
			//returning an array reference from a method
		double[] arrayDoubles = getNumbers();
		
		System.out.println("Data return from method");
		for(double i : arrayDoubles)
		{
			
			System.out.println(i);
		}
		
			//String arrays
		String[] names = new String[5];
		
		names[0] = "Bob";
		names[1] = "Bill";
		names[2] = "Jack";
		names[3] = "Jill";
		names[4] = "Chris";
		
		String[] anotherNamesList = {"Charles", "Evan", "Pat"};
		
		
		
		
			//Calling String methods on array elements
		System.out.println(names[0].toUpperCase());
		System.out.println(names[2].charAt(3));
		
		
	}
	
	public static double[] getNumbers()
	{
		double[] nums = {1.2,2.2,3.3};
		return nums;
	}
	
}
