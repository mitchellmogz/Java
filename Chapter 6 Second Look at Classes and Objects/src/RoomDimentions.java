
public class RoomDimentions {

	private double length;
	private double width;
	
	public RoomDimentions(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public String toString()
	{
		return "\nLength: " + length + "\nWidth: " + width + "\n ";
	}
}
