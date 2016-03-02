package Number5;
@SuppressWarnings("serial")
public class IDException extends Exception
{
		//no arg constructor
	public IDException()
	{
		super("An error occured. You cannot have the ID Number be 0 or lower.");
	}
		
		//this constructor accepts the balance and uses that in the message to the end user
	public IDException(int id)
	{
		super("An error occured. You cannot have the ID Number be 0 or lower. The number you entered is " + id + ".");
	}
}