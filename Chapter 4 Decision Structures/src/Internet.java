
public class Internet {
	
			//fields
		double price;
		double mega;
		double cent;
		
			//constructor
		public Internet(double p, double m, double c)
		{
			price = p;
			mega = m;
			cent = c;					
		}
		
			//Mutators
		public void setPrice(double p)
		{
			price = p;
		}
	
		public void setMega(double m)
		{
			mega = m;
		}
		
		public void setCent(double c)
		{
			cent = c;
		}
		
			//accessors
		public double getPrice()
		{
			return price;
		}
		
		public double getMega()
		{
			return mega;
		}
		
		public double getCent()
		{
			return cent;
		}
		
		public double getPackA()
		{
			if (mega <= 1000)
			{
				return 49.99;
			}
			else if (mega > 1000)
			{
				return 49.99 + (((mega - 1000.00) / 50) * 0.40);
			}
			return cent;
		}
		
		public double getPackB()
		{
			if (mega <= 3000)
			{
				return 69.99;
			}
			else if (mega > 3000)
			{
				return 69.99 + (((mega - 3000.00) / 50) * 0.30);
			}
			return cent;
		}
		
		public double getPackC()
		{
			return 79.99;
		}
}
