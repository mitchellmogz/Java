import java.text.DecimalFormat;

public class Payroll {

			//Fields
		private int hours;
		private double payRate;
		private double wages;
		
			//Laugh and Cry
		DecimalFormat zoid = new DecimalFormat("######0.00");
		
			//Constructor
		public Payroll(int hours, double payRate, double wages) 
		{
			super();
			this.hours = hours;
			this.payRate = payRate;
			this.wages = wages;
		}

			//Setters
		public void setHours(int hours) 
		{
			this.hours = hours;
		}
		
		public void setPayRate(double payRate)
		{
			this.payRate = payRate;
		}
		
		public void setWages(double wages) 
		{
			this.wages = wages;
		}
		
			//Getters
		public int getHours() {
			return hours;
		}
		
		public double getPayRate()
		{
			return payRate;
		}
		
		public double getWages()
		{
			return wages;
		}
		
		public double getGrossPay()
		{
			return hours * payRate;
		}

			//toString
		public String toString() {
			return "\nPayroll\nHours: " + hours + "\nPay Rate: $" + zoid.format(payRate) + "\nWages: $" + zoid.format(wages) +
					"\nGross Pay: $" + zoid.format(getGrossPay()) + "\n";
		}
	
}
