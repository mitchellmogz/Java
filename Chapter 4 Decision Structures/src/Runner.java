
public class Runner {
	
	//Fields
		private String run1;
		private String run2;
		private String run3;
		private double time1;
		private double time2;
		private double time3;
	
	//Constructor
	
		public Runner(String r1, String r2, String r3, double t1, double t2, double t3)
		{
			run1 = r1;
			run2 = r2;
			run3 = r3;
			time1 = t1;
			time2 = t2;
			time3 = t3;
		}
	
	//Mutator
		public void setRun1(String r1)
		{
			run1 = r1;
		}
		
		public void setRun2 (String r2)
		{
			run2 = r2;
		}
		
		public void setRun3 (String r3)
		{
			run3 = r3;
		}
		
		public void setTime1 (double t1)
		{
			time1 = t1;
		}
		
		public void setTime2 (double t2)
		{
			time2 = t2;
		}
		
		public void setTime3 (double t3)
		{
			time3 = t3;
		}
	
	//Accessors
		public String getRun1()
		{
			return run1;
		}
	
		public String getRun2()
		{
			return run2;
		}
	
		public String getRun3()
		{
			return run3;
		}
		
		public double getTime1()
		{
			return time1;
		}
		
		public double getTime2()
		{
			return time2;
		}
		
		public double getTime3()
		{
			return time3;
		}
	
}