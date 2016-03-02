
public class RoomCarpet {

	private RoomDimentions RoomDimention;
	private double cost;
	
	 public RoomCarpet(RoomDimentions room, double c) 
	 	{
	        RoomDimention = room;
	        cost = c;
	    }

	    public double getTotalCost() 
	    {
	        return cost * RoomDimention.getArea();
	    }

	    public String toString() 
	    {
	        return "\nRoom Dimensions: " + RoomDimention
	                + "\nCost Of Carpet: " + cost + "\n"
	                        + "Total Cost: " + getTotalCost() + ".";
	    }
	
}
