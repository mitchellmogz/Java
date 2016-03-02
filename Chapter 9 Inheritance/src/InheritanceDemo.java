
public class InheritanceDemo {

	public static void main(String[] args) {
		
			//Inheritance and Constructors
		Car myCar = new Car();
		myCar.setColor("Silver");
		myCar.setMake("Malabo");
		myCar.setWheels(2);
		Car yourCar = new Car("Red", 4, "Jeep");
		
		System.out.println(myCar);
		
		System.out.println(yourCar.toString());
		
			//Prevent a method from being overridden
		
		
		
			//Introduce a NEW access modifier... protected members
		
		
		
	}

}
