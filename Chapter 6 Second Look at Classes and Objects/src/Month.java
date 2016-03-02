
public class Month {

			//Fields
		private int monthNumber;
		private String name;
		
			//no-arg
		public Month()
		{
			
			monthNumber = 1; 
			
		}
		
			//constructor number
		public Month(int m)
		{
			
			if(m < 1 || m > 12)
			{
			
				monthNumber = 1;
				
			}
			
			else	
			{
				
				monthNumber = m;
				
			}
			
		}
		
			//constructor name
		public Month(String name)
		{
			
			if(name.equalsIgnoreCase("JANUARY"))
			{
				
				monthNumber = 1;
				
			}
			
			else if(name.equalsIgnoreCase("FEBRUARY"))
			{
				
				monthNumber = 2;
				
			}
			
			else if(name.equalsIgnoreCase("MARCH"))
			{
				
				monthNumber = 3;
				
			}
			
			else if(name.equalsIgnoreCase("APRIL"))
			{
				
				monthNumber = 4;
				
			}
			
			else if(name.equalsIgnoreCase("MAY"))
			{
				
				monthNumber = 5;
				
			}
			
			else if(name.equalsIgnoreCase("JUNE"))
			{
				
				monthNumber = 6;
				
			}
			
			else if(name.equalsIgnoreCase("JULY"))
			{
				
				monthNumber = 7;
				
			}
			
			else if(name.equalsIgnoreCase("AUGUST"))
			{
				
				monthNumber = 8;
				
			}
			
			else if(name.equalsIgnoreCase("SEPTEMBER"))
			{
				
				monthNumber = 9;
				
			}
			
			else if(name.equalsIgnoreCase("OCTOBER"))
			{
				
				monthNumber = 10;
				
			}
			
			else if(name.equalsIgnoreCase("NOVEMBER"))
			{
				
				monthNumber = 11;
				
			}
			
			else if(name.equalsIgnoreCase("DECEMBER"))
			{
				
				monthNumber = 12;
				
			}
			
			else
			{
				
				monthNumber = 1;
				
			}
		}
		
			//Mutator
		public void setMonthNumber(int m)
		{
			
			if(m < 1 || m > 12)
			{
				
				monthNumber = 1;
				
			}
			
			else
			{
				
				monthNumber = m;
				
			}
		}
		
			//Accessor
		public int getMonthNumber()
		{
			
			return monthNumber;
			
		}
		
		public String getMonthName()
		{
			
			switch(monthNumber)
			{
			
				case 1: 
				{
					
					name = "January";
					break;
					
				}
				
				case 2:
				{
					
					name = "February";
					break;
					
				}
				
				case 3:
				{
					
					name = "March";
					break;
					
				}
				
				case 4:
				{
					
					name = "April";
					break;
					
				}
				
				case 5:
				{
					
					name = "May";
					break;
					
				}
				
				case 6:
				{
					
					name = "June";
					break;
					
				}
				
				case 7:
				{
					
					name = "July";
					break;
					
				}
				
				case 8:
				{
					
					name = "August";
					break;
					
				}
				
				case 9:
				{
					
					name = "September";
					break;
					
				}
				
				case 10:
				{
					
					name = "October";
					break;
					
				}
				
				case 11:
				{
					
					name = "November";
					break;
					
				}
				
				case 12:
				{
					
					name = "December";
					break;
					
				}
				
				default: 
				{
					
					name = "Unknown";
					
				}
			
			}
			
			return name;
			
		}
		
		public String toString()
		{
			
			return getMonthName();
			
		}
		
		public boolean equals(Month month2)
		{
			boolean status;
			
			if (month2.getMonthNumber() == monthNumber)
			{
				
				status = true;
				
			}
			
			else
			{
				
				status = false;
				
			}
			
			return status;
		}
		
		public boolean greaterThan(Month month2)
		{
			boolean status;
			
			if (monthNumber > month2.getMonthNumber())
			{
				
				status = true;
				
			}
			else 
			{
				
				status = false;
				
			}
			
			return status;
			
		}
		
		public boolean lessThan(Month month2)
		{
			boolean status;
			
			if (monthNumber < month2.getMonthNumber())
			{
				
				status = true;
				
			}
			else
			{
				
				status = false;
				
			}	
			
			return status;
		}
			
}
