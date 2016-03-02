
public class ParkingMeter {

		//Fields
	private int parkingMinutes;
	
		//Constructor
	public ParkingMeter(int parkingMinutes)
	{
		this.parkingMinutes = parkingMinutes;
	}
	
		//toString method
	public String toString()
	{
		String str;
		
			//String describing the item
		str = "Number of Minutes Purchased: " + parkingMinutes;
			
			//RETURN
		return str;
	}
	
		//Mutator
	public void setParkingMinutes(int parkingMinutes)
	{
		this.parkingMinutes = parkingMinutes;
	}
	
		//Accessor
	public int getParkingMinutes()
	{
		return parkingMinutes;
	}
}
