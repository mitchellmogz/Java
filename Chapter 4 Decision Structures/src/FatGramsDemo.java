
public class FatGramsDemo {
	
	//Fields
		private double calories;
		private double fat;
	
	//Constructor
		public FatGramsDemo(double c, double f)
		{
			calories = c;
			fat = f;			
		}
	
	//Mutator
		public void setCalories(double c)
		{
			calories = c;
		}
		
		public void setFat (double f)
		{
			fat = f;
		}		
	
	//Accessors
		public double getCalories()
		{
			return calories;
		}
	
		public double getFat()
		{
			return fat;
		}
	
		public double getGross()
		{
			return ((fat * 9) / calories) * 100;
		}
}