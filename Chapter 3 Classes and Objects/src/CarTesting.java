
public class CarTesting {

	public static void main (String[] args) 
	{
		Car car1 = new Car("Volvo","S60", 2014);
		
		System.out.println("Car 1: " + car1.getYear() + "  " + car1.getMake() );
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushGas();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushGas();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushGas();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushGas();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushGas();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushBrake();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushBrake();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushBrake();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushBrake();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
		car1.pushBrake();
		
		System.out.printf("\nThe speed of Car 1 is : %dmph", car1.getSpeed());
		
	}
}
