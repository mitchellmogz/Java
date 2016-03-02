
public class ParkingTicket {

		//Fields
	ParkedCar car1;
	ParkingMeter meter1;
	PoliceOfficer guy1;
	private int price;
	
	
		//Constructor
	public ParkingTicket(ParkedCar car1, PoliceOfficer guy1, int p)
	{
		this.car1 = car1;
		this.guy1 = guy1;
		price = p;
	}
	
		//Mutator
	public void setPrice(int p)
	{
		price = p;
	}
	
		//Accessor
	public int getPrice()
	{
		return price;
	}
	

	
	
}
