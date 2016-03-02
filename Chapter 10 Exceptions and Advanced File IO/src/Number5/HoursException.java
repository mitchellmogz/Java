package Number5;
@SuppressWarnings("serial")
public class HoursException extends Exception
{
		//no arg constructor
	public HoursException()
	{
		super("An error occured. You cannot have a negative numnber or a number greater than 84.");
	}
		
		//this constructor accepts the balance and uses that in the message to the end user
	public HoursException(int hours)
	{
		super("An error occured. You cannot have a negative numnber or a number greater than 84. You entered " + hours + ".");
	}
}