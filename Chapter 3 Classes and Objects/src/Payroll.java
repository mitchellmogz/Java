
public class Payroll {
	
	//Fields
		private String name;
		private int id ; 
		private double pay;
		private double hours;
		private double gross;
	
	//Constructor
	
		public Payroll(String n, int ID, double p, double h, double g)
		{
			name = n;
			id = ID;
			pay = p;
			hours = h;
			gross = g;
		}
	
	//Mutator
		public void setName(String n)
		{
			name = n;
		}
		
		public void setID (int ID)
		{
			id = ID;
		}
		
		public void setHPR (double p)
		{
			pay = p;
		}
		
		public void setNHW (double h)
		{
			hours = h;
		}
		
		public void setGross (double g)
		{
			gross = g;
		}
	
	//Accessors
		public String getName()
		{
			return name;
		}
	
		public int getID()
		{
			return id;
		}
	
		public double getHPR()
		{
			return pay;
		}
		public double getNHW ()
		{
			return hours;
		}
		public double getGross()
		{
			return gross;
		}
	
}
