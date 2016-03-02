package Number3;
@SuppressWarnings("serial")
public class PriceException extends Exception {

		//no arg constructor
	public PriceException()
	{
		super("An error occured. You cannot have a negative price.");
	}
	
		//this constructor accepts the balance and uses that in the message to the end user
	public PriceException(double price)
	{
		super("An error occured. You cannot have a negative price. The price you entered was " + price);
	}
}