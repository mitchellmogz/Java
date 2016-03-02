
public class POPulation {
	
	//Fields
		private double start;
		private double per;
		private double days;
	
	//Constructor
		public POPulation(double s, double p, double d)
		{
			start = s;
			per = p;
			days = d;
		}
	
	//Mutator
		public void setStart(double s)
		{
			start = s;
		}
		
		public void setPer(double p)
		{
			per = p;
		}		
		
		public void setDays(double d)
		{
			days = d;
		}
	
	//Accessors
		public double getStart()
		{
			return start;
		}
	
		public double getPer()
		{
			return per;
		}
	
		public double getDays()
		{
			return days;
		}
		
		public double getTotal()
		{
			return ((start * per) / 100) + start;
		}
		
		public double getIncrease()
		{
			return per / 100;
		}
}