
public class PayrollReport {
	
	//Fields
		private double gross;
		private double state;
		private double federal;
		private double fica;
		
	//Constructor
		public PayrollReport(double g, double s, double f, double a)
		{
			gross = g;
			state = s;
			federal = f;
			fica = a;
		}
	
	//Mutator
		public void setGross(double g)
		{
			gross = g;
		}
		
		public void setState(double s)
		{
			state = s;
		}
		
		public void setFederal(double f)
		{
			federal = f;
		}
		
		public void setFica(double a)
		{
			fica = a;
		}
	
	//Accessors
		public double getGross()
		{
			return gross;
		}
	
		public double getState()
		{
			return state;
		}
	
		public double getFederal()
		{
			return federal;
		}
		
		public double getFica()
		{
			return fica;
		}
		
		public double getNet()
		{
			return gross - state - federal - fica;
		}
}