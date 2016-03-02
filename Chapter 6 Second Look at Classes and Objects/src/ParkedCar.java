
public class ParkedCar {

		//Fields
	private String make;
	private String model;
	private String color;
	private int license;
	private int minutes;
	
		//Constructor
	public ParkedCar(String make, String model, String color, int license, int minutes)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.license = license;
		this.minutes = minutes;
	}
	
		//toString method
	public String toString()
	{
		String str;
		
			//String describing the item
		str = "Car's Make: " + make + "\nCar's Model: " + model + "\nCar's Color: " + 
			  color + "\nLicense Number: " + license + "\nNumber of Minutes Parked: " + minutes;
		
			//RETURN
		return str;
	}
	
		//Mutator
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setLicense(int license)
	{
		this.license = license;
	}
	
	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
		//Accessor
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getLicense()
	{
		return license;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
}
