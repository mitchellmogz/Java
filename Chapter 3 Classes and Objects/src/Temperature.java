
public class Temperature {
	
	//Fields
		private double ftemp;
		private double ctemp;
		private double ktemp;
	
	//Constructor
	
		public Temperature(double f, double c, double k)
		{
			ftemp = f;
			ctemp = c;
			ktemp = k;
		}
	
	//Mutator
		public void setFahrenheit(double f)
		{
			ftemp = f;
		}
		
		public void setCelsius (double c)
		{
			ctemp = c;
		}
		
		public void setKelvin (double k)
		{
			ktemp = k;
		}
	
	//Accessors
		public double getFahrenheit()
		{
			return ftemp;
		}
	
		public double getCelsius()
		{
			return ctemp;
		}
	
		public double getKelvin()
		{
			return ktemp;
		}
	
}
