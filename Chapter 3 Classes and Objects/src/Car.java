
public class Car {

	//private variables to store the attributes of the car
	private String make;
	private String model;
	private int year;
	private int currentSpeed;
	
	//This is a 3 argument constructor that will create a new Car object
	
	public Car(String manufacturer, String carType, int createdOn)
	{
		make = manufacturer;
		model = carType;
		year = createdOn;
		currentSpeed = 0;
	}
	//end of constructor
	
	//Accessor methods
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getCurrentSpeed()
	{
		return currentSpeed;
	}
	
	
	// This method will simulate pushing the gas pedal
	
	public void pushGas()
	
	{
		currentSpeed += 5;
	}
	
	public void pushBrake()
	
	{
		currentSpeed -= 5;
	}
	
	//This method will show how fast the car is going
	
	public int getSpeed()
	{
		return currentSpeed;
	}
	
}
