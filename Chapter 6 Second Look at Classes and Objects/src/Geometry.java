
public class Geometry
{
	public static double getArea(double radius)
		{
			return Math.PI * radius * radius;	
		}
	
	public static double getArea(int length, int width)
		{
			return length * width;
		}
	
	public static double getArea(double base, double height)
		{
			return base * height * 0.5;	
		}

}
