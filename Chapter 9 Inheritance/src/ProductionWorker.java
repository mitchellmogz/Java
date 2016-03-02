
public class ProductionWorker extends Employee {

	private int shift;
	private double rate;
	
	
	public ProductionWorker(String name, int num, String date, int shift, double rate) {
		super(name, num, date);
		this.shift = shift;
		this.rate = rate;
	}
	
	
	public ProductionWorker()
	{
		
	}
	
	public ProductionWorker(int shift, double rate)
	{
		this.shift = shift;
		this.rate = rate;
	}
	
	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}


		//toString
	public String toString() {
		return "\nThis is using the ProductionWorkerClass\nProduction Worker\nName: " + name + "\nEmployee Number: " + num + "\nDate Started: " + date + "\nShift: " + shift + "\nPay Rate: " + rate + "\n";
	}
	
	
	
	
}
