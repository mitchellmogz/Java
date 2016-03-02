package demos;

public class ExceptionDemo2 {

	public static void main(String[] args)
	{
		
			//Matching excption types
		//try
		//{
		//	System.out.println(5/0);
		//}
		//catch(ArithmeticException ex)
		//{
		//	System.out.println(ex.getMessage());
		//}
			//getMessage()
		
			//Polymorphic references to exceptions
			//any parent can catch an exception from their child
		try
		{
			System.out.println(5/0);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
			//handling multiple execptions
		int number;
		try
		{
			
			number = Integer.parseInt("Hano");
			
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
	}
	
}
