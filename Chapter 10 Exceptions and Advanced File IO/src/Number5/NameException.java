package Number5;
@SuppressWarnings("serial")
public class NameException extends Exception
{
		//no arg constructor
	public NameException()
	{
		super("An error occured. You cannot have a blank name.");
	}
		
		//this constructor accepts the balance and uses that in the message to the end user
	public NameException(String name)
	{
		super("An error occured. You cannot have a blank name.");
	}
}