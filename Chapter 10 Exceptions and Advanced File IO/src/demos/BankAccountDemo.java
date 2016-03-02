package demos;

public class BankAccountDemo {

		//field
	private double balance;
	
	public void setBalance(double balance)
	{
		if(balance < 0)
		{	
				//manually throwing an exception
			throw new IllegalArgumentException();
		}
		
		this.balance = balance;
	}
	
}
