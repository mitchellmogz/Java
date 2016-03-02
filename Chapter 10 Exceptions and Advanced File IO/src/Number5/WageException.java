package Number5;
@SuppressWarnings("serial")
public class WageException extends Exception
{
		//no arg constructor
	public WageException()
	{
		super("An error occured. You cannot have a negative number or greater than 25.");
	}
		
		//this constructor accepts the balance and uses that in the message to the end user
	public WageException(double wage)
	{
		super("An error occured. You cannot have a negative number or greater than 25. You entered " + wage + ".");
	}
}