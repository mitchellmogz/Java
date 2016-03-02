
public class TeamLeader extends ProductionWorker {

		//Fields
	final private double monthly = 125.25;
	final private int require = 25;
	private double have;
	private double hourly;
	
		
	
	public TeamLeader(String name, int num, String date, int shift, double rate, double have, double hourly) {
		super(name, num, date, shift, rate);
		this.have = have;
		this.hourly = hourly;
	}

	//Constructor
	public TeamLeader(double have, double hourly)
	{
		this.hourly = hourly;
		this.have = have;
	}
		
	public double getHourly() {
		return hourly;
	}

	public void setHourly(double hourly) {
		this.hourly = hourly;
	}

		//Getters and Setters
	public double getMonthly() {
		return monthly;
	}
	public double getHave() {
		return have;
	}
	public void setHave(double have) {
		this.have = have;
	}
	public int getRequire() {
		return require;
	}
	
	
	
	
}
