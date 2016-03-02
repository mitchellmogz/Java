
public class Vehicle {

		//Vields
	private String color;
	private int wheels;
	protected boolean hasRoof;
	
		//Default
	public Vehicle()
	{
		
	}
	
		//toString
	public String toString() {
		return "\nVehicle Color: " + color + "\nNumber of Wheels: " + wheels + "\nHas Roof: " + hasRoof + "\n";
	}

	//2 param Overloaded Constructor
	public Vehicle(String color, int wheels)
	{
		super();
		this.color = color;
		this.wheels = wheels;
	}
	
		//Getters and Setters for fields
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
		
	
}
