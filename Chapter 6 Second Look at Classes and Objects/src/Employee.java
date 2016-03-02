
public class Employee {

		//Fields
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
		//Constructor
	public Employee(String n, int id, String d, String p)
	{
		name = n;
		idNumber = id;
		department = d;
		position = p;
	}
	
		//second constructor
	public Employee(String n, int id)
	{
		name = n;
		idNumber = id;
		department = "empty";
		position = "empty";
	}

		//no-arg constructor
	public Employee()
	{
		name = "empty";
		idNumber = 0;
		department = "empty";
		position = "empty";
	}
	
	
		//Mutator
	public void setName(String n)
	{
		name = n;
	}
	
	public void setIDNumber(int id)
	{
		idNumber = id;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	
	public void setPosition(String p)
	{
		position = p;
	}
	
		//Accessor
	public String getName()
	{
		return name;
	}
	
	public int getIDNumber()
	{
		return idNumber;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getPosition()
	{
		return position;
	}
}
