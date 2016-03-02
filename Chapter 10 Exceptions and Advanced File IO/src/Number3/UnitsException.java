package Number3;
@SuppressWarnings("serial")
public class UnitsException extends Exception {

		//no arg constructor
	public UnitsException()
	{
		super("An error occured. You cannot have a negative number of units on hand.");
	}
	
		//this constructor accepts the balance and uses that in the message to the end user
	public UnitsException(int unit)
	{
		super("An error occured. You cannot have a negative number of units on hand. The number you entered was " + unit);
	}
}