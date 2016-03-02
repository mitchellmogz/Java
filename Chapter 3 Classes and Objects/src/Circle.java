
public class Circle {
	
			//Fields
		private double radius;
		private double diameter;
		private double circumference;
		private double area;
		private double pi = 3.14159;
	
			//Constructor
		public Circle(double r, double d, double c, double a, double PI)
		{
			radius = r;
			diameter = d;
			circumference = c;
			area = a;
			pi = PI;
		}

			//Mutator
		public void setRadius(double r)
		{
			radius = r;
		}
		
		public void setDiameter (double d)
		{
			diameter = d;
		}
		
		public void setCircumference (double c)
		{
			circumference = c;
		}
		
		public void setArea (double a)
		{
			area = a;
		}
		
		public void setPI (double PI)
		{
			pi = PI;
		}
	
			//Accessors
		public double getRadius()
		{
			return radius;
		}
	
		public double getDiameter()
		{
			return diameter;
		}
	
		public double getCircumference()
		{
			return circumference;
		}
		
		public double getArea()
		{
			return area;
		}
		
		public double getPI()
		{
			return pi;
		}
}