package demos;

public class NegativeBalanceDemo extends Exception {

		//no arg constructor
	public NegativeBalanceDemo()
	{
		super("An error occured. You cannot have a negative balance.");
	}
	
		//this constructor accepts the balance and uses that in the message to the end user
	public NegativeBalanceDemo(double balance)
	{
		super("An error occured. You cannot have a negative balance. Your balance was " + balance);
	}
	
	
}
