
public class Employee {
		
		//Fields
	protected String name;
	protected int num;
	protected String date;
	
		//Constructors
	public Employee(String name, int num, String date) {
		super();
		this.name = name;
		this.num = num;
		this.date = date;
	}
	
		

	//no-arg Constructor
	public Employee()
	{
		
	}
	
		//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
		//toString
	public String toString() {
		return "\nThis is using the EmployeeClass\nEmployee [name=" + name + ", num=" + num + ", date=" + date + "]";
	}
	
}
