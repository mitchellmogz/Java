
public class Car extends Vehicle {
	
		//fields
	private String make;

	
		//Setter and Getters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
		//3 param Constructor
	public Car(String color, int wheels, String make)
	{
		super(color,wheels);
		this.make = make;
	}
	
		//no arg default constructor
	public Car()
	{
		
	}

	//toString
	public String toString() {
		return super.toString() + "Car Make: " + make + "" + hasRoof;
	}
	
	

	

}
