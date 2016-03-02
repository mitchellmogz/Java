package Number5;

public class PayrollClass {

			//Fields
		private String name;
		private int id;
		private double wage;
		private int hours;
		
		
			//no-arg constructor
		public PayrollClass() 
		{
			super();
		}
		
			//no-arg constructor
		public PayrollClass(String name) 
		{
			super();
			this.name = name;
		}
		
			//constructor
		public PayrollClass(String name, int id, double wage, int hours) 
		{
			super();
			this.name = name;
			this.id = id;
			this.wage = wage;
			this.hours = hours;
		}


			//Getters
		public String getName()
		{
			return name;
		}
		
		public int getId()
		{
			return id;
		}
		
		public double getWage()
		{
			return wage;
		}
		
		public int getHours()
		{
			return hours;
		}
		
		public double getPay()
		{
			return wage * hours;
		}
		
			//Setters
		public void setHours(int hours) throws HoursException
		{
		
			if(hours < 0 || hours > 84) 
			{
				throw new HoursException(hours);
			}
			
			this.hours = hours;
		}
		
		public void setWage(double wage) throws WageException
		{
			
			if(wage < 0 || wage > 25)
			{
				throw new WageException(wage);
			}
			
			this.wage = wage;
		}
		public void setName(String name) throws NameException
		{
			if(name.equals(""))
			{
				throw new NameException(name);
			}
			
			this.name = name;
		}
		
		public void setId(int id) throws IDException
		{
			
			if(id <= 0)
			{
				throw new IDException(id);
			}
			
			this.id = id;
		}
	
}
