
public class Track {
	
		//Fields
	private int length;
	private int width;
	
		//First Constructor
	public Track(int l, int w)
	{
		length = l;
		width = w;
	}

		//Copy Constructor
	public Track(Track object2)
	{
		length = object2.length;
		width = object2.width;
	}

		//Accessor
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getArea()
	{
		return width * length;
	}
	
		//using toString to return
	public String toString()
	{
		String str = getArea() + "\n";
		
		return str;
	}
}
