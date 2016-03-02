package demos;
import java.util.Scanner;
import java.io.*;


public class ExceptionDemo3 {

	public static void main(String[] args) throws IOException
	{
		
			//finally clause
		PrintWriter pw = null;
		try
		{
			pw = new PrintWriter("my.txt");
			System.out.println(5/0);
			pw.write("Hello");
		}
		catch(ArithmeticException ex)
		{
			
		}
		finally
		{
			pw.close();
		}
			//stack trace
			//list of methods that have been called
			//Help trouble shoot the sequence of events
		
		methodA();
		
			//uncaught exceptions
		
		
		
		
	}
	
	public static void methodA()
	{
		try
		{
			methodB();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception Caught");
		}
	}

	public static void methodB()
	{
		//try
		//{
			methodC();
		//}
		//catch(ArithmeticException ex)
		//{
		//	System.out.println("Exception Caught");
		//}
		
	}
	public static void methodC()
	{
		//try
		//{
			System.out.print(5/0);
		//}
		//catch(ArithmeticException ex)
		//{
			//ex.printStackTrace();
		//}
	}
}
