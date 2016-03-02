
public class ShiftSupervisor extends Employee {

		//Fields
	private double salary;
	private double bonus;
	
	public ShiftSupervisor(String name, int num, String date, double salary, double bonus)
	{
		super(name, num, date);
		this.salary = salary;
		this.bonus = bonus;
		
	}
	
	public ShiftSupervisor(double salary, double bonus)
	{
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double getBonus()
	{
		return bonus;
	}
}
