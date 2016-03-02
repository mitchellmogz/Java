import java.util.Scanner;

public class TicketMaster {

	public static void main(String[] args)
	{
		
			//Variables
		String make;
		String model;
		String color;
		String name;
		int license;
		int minutes;
		int parkingMinutes;
		int badge;
		int price = 0;

		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//Input info
		System.out.println("St.Louis Police Department Parking Ticket System\nPlease enter your name.");
		name = keyboard.nextLine();
		
		System.out.println("Hello Officer " + name + ". Please enter your badge number to verify.");
		badge = keyboard.nextInt();
		
		System.out.println("Enter car's make.");
			//Buffer
		keyboard.nextLine();
		make = keyboard.nextLine();
		
		System.out.println("Enter car's model.");
		model = keyboard.nextLine();
		
		System.out.println("Enter car's color");
		color = keyboard.nextLine();
		
		System.out.println("Enter license number.");
		license = keyboard.nextInt();
		
		System.out.println("Enter number of minutes that the car has been parked.");
		minutes = keyboard.nextInt();
		
		System.out.println("Enter number of minutes purchased on the parking meter.");
		parkingMinutes = keyboard.nextInt();
		
		
		
			//instance
		ParkedCar car1 = new ParkedCar(make, model, color, license, minutes);
		ParkingMeter meter1 = new ParkingMeter(parkingMinutes);
		PoliceOfficer guy1 = new PoliceOfficer(name, badge);
		ParkingTicket ticket1 = new ParkingTicket(car1, guy1, price);
		
		System.out.println(guy1);
		System.out.println(car1);
		System.out.println(meter1);
		System.out.println(ticket1);
			
		
		keyboard.close();
	}
	
}
