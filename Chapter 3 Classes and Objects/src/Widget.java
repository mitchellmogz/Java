
public class Widget {
	
	//Fields
		private double widget;
		private double gross; 
	
	//Constructor	
		public Widget(double w, double g)
		{
			widget = w;
			gross = g;
		}
	
	//Mutator
		public void setWidget(double w)
		{
			widget = w;
		}
		
		public void setGross (double g)
		{
			gross = g;
		}
		
	//Accessors
		public double getWidget()
		{
			return widget;
		}
	
		public double getGross()
		{
			return gross;
		}
}