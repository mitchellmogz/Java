package demos;

public class BankAccountDemo2 {

		//field
	private double balance;
	
	public void setBalance(double balance) throws NegativeBalanceDemo
	{
		if(balance < 0)
		{	
				//manually throwing an exception
			throw new NegativeBalanceDemo(balance);
		}
		
		this.balance = balance;
	}
	
}
