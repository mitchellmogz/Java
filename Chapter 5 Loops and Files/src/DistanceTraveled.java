
public class DistanceTraveled {
	
	//Fields
		private int hours;
		private int speed;
	
	//Constructor
		public DistanceTraveled(int h, int s)
		{
			hours = h;
			speed = s;
		}
	
	//Mutator
		public void setHours(int h)
		{
			hours = h;
		}
		
		public void setSpeed(int s)
		{
			speed = s;
		}		
	
	//Accessors
		public int getHours()
		{
			return hours;
		}
	
		public int getSpeed()
		{
			return speed;
		}
	
		public double getDistance()
		{
			return speed * hours;
		}
}