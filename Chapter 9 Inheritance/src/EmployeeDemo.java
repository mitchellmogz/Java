
import java.util.Scanner;

public class EmployeeDemo {
	
	public static void main(String[] args){

		//Varibles
	String name;
	int num;
	String date;
	int shift;
	double rate;
	double salary;
	double bonus;
	double have;
	double hourly;
	
	
		//Sccanner
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter name.");
	name = keyboard.nextLine();
	
	
	System.out.println("Enter empolyee number.");
	num = keyboard.nextInt();
	
	keyboard.nextLine();
	
	System.out.println("Enter employee start date.");
	date = keyboard.nextLine();
	
	System.out.println("Enter 1 or 2 for shft number.");
	shift = keyboard.nextInt();
	
	System.out.println("Enter Pay Rate for employee.");
	rate = keyboard.nextDouble();
	
	System.out.println("Enter salary for employee.");
	salary = keyboard.nextDouble();
	
	System.out.println("Enter bonus for employee.");
	bonus = keyboard.nextDouble();
	
	System.out.println("Enter amount of hours of training for employee.");
	have = keyboard.nextDouble();
	
	System.out.println("Enter Hourly Rate for Team Leader.");
	hourly = keyboard.nextDouble();
	
	keyboard.close();
	
	Employee guy1 = new Employee();
	ProductionWorker guy2 = new ProductionWorker();
	ShiftSupervisor guy3 = new ShiftSupervisor(salary, bonus);
	TeamLeader guy4 = new TeamLeader(have, hourly);
	
	guy1.setName(name);
	guy1.setNum(num);
	guy1.setDate(date);
	
	guy2.setName(name);
	guy2.setNum(num);
	guy2.setDate(date);
	guy2.setShift(shift);
	guy2.setRate(rate);
	
	guy3.setName(name);
	guy3.setNum(num);
	guy3.setDate(date);
	
	guy4.setName(name);
	guy4.setNum(num);
	guy4.setDate(date);
	
	
	System.out.println(guy1);
	System.out.println(guy2);
	System.out.println("\nThis is using the ShiftSupervisorClass\nShift Supervisor\nName: " + guy3.getName() + "\nEmployee Number: " + 
	guy3.getNum() + "\nDate Started: " + guy3.getDate() + "\nSalary: " + guy3.getSalary() + "\nBonus: " + guy3.getBonus() );
	
	System.out.println("\nThis is using the TeamLeaderClass\nTeam Leader\nName: " + guy4.getName() + "\nEmployee Number: " + guy4.getNum() + 
	"\nDate Started: " + guy4.getDate() + "\nHourly Pay: " + guy4.getHourly() + "\nMonthly Bonus: " + guy4.getMonthly() + "\nMinimmum Hours: " +
	guy4.getRequire() + "\nCurrent Hours: " + guy4.getHave() );
	
	}
	
}
