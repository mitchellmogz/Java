import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args)
	{
		
			//Variables
		String name;
		int idNumber;
		String department;
		String position;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//Enter Info for employee 1
		System.out.println("Please enter a name for employee 1.");
		name = keyboard.nextLine();
		
		System.out.println("Please enter an ID Number for employee 1.");
		idNumber = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("Please enter a Department for employee 1.");
		department = keyboard.nextLine();
		
		System.out.println("Please enter a Position for employee 1.");
		position = keyboard.nextLine();
		
			//create object 1
		Employee employee1 = new Employee(name, idNumber, department, position);
		
			//Enter Info for employee 2
		System.out.println("Please enter a name for employee 2.");
		name = keyboard.nextLine();
				
		System.out.println("Please enter an ID Number for employee 2.");
		idNumber = keyboard.nextInt();
		keyboard.nextLine();
		
			//create object 2
		Employee employee2 = new Employee(name, idNumber);
			
			//create object 3
		Employee employee3 = new Employee();
		
			//output
		System.out.println("Name          ID Number       Department       Position");
		System.out.println(employee1.getName() + "   " + employee1.getIDNumber() + "   " + employee1.getDepartment() + "   " + employee1.getPosition());
		System.out.println(employee2.getName() + "     " + employee2.getIDNumber() + "   " + employee2.getDepartment() + "   " + employee2.getPosition());
		System.out.println(employee3.getName() + "     " + employee3.getIDNumber() + "   " + employee3.getDepartment() + "   " + employee3.getPosition());
		
	}
	
}
