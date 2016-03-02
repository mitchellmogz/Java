
public class Pet {
	
	//Fields
		private String name;
		private String type;
		private int age;
	
	//Constructor
	
		public Pet(String n, String t, int a)
		{
			name = n;
			type = t;
			age = a;
		}

		//Mutator
		public void setName(String n)
		{
			name = n;
		}
		
		public void setType (String t)
		{
			type = t;
		}
		
		public void setAge (int a)
		{
			age = a;
		}
	
	//Accessors
		public String getName()
		{
			return name;
		}
	
		public String getType()
		{
			return type;
		}
	
		public int getAge()
		{
			return age;
		}	
}