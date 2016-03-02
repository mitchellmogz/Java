
public class Shipping {
	
	//Fields
		private int weight;
		private int miles;
		
	//Constructor
	
		public Shipping(int w, int m)
		{
			weight = w;
			miles = m;
		}

		//Mutator
		public void setWeight(int w)
		{
			weight = w;
		}
		
		public void setMiles (int m)
		{
			miles = m;
		}
			
	//Accessors
		public int getWeight()
		{
			return weight;
		}
	
		public int getMiles()
		{
			return miles;
		}
		public double getGross1()
		{
			return (getMiles() / 500) * 1.10;
		}
		public double getGross2()
		{
			return (getMiles() / 500) * 2.20;
		}
		public double getGross3()
		{
			return (getMiles() / 500) * 3.70;
		}
		public double getGross4()
		{
			return (getMiles() / 500) * 4.80;
		}
	}