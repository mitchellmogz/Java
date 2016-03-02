
public class MobileService {
	
	//Fields
		private char num;
		private double packAP;
		private double packAM;
		private double packAC;
		private double packBP;
		private double packBM;
		private double packBC;;
		private double packCC;
		private double packAT;
		private double packBT;
		private double packCT;
		
	//Constructor
		public MobileService(char n, double ap, double am, double ac, double bp, double bm, double bc, double cc)
		{
			num = n;
			packAP = ap;
			packAM = am;			
			packAC = ac;
			packBP = bp;
			packBM = bm;
			packBC = bc;
			packCC = cc;
		}
	
	//Mutator
		public void setPackAP(double ap)
		{
			packAP = ap;
		}
		
		public void setPackAM (double am)
		{
			packAM = am;
		}
		
		public void setPackAC (double ac)
		{
			packAC = ac;
		}
		
		public void setPackBP (double bp)
		{
			packBP = bp;
		}
		
		public void setPackBM (double bm)
		{
			packBM = bm;
		}
		
		public void setPackBC (double bc)
		{
			packBC = bc;
		}
		
		public void setPackCC (double cc)
		{
			packCC = cc;
		}
	
	//Accessors
		public double getPackAP()
		{
			return packAP;
		}
	
		public double getPackAM()
		{
			return packAM;
		}
	
		public double getPackAC()
		{
			return packAC;
		}
		
		public double getPackBP()
		{
			return packBP;
		}
		
		public double getPackBM()
		{
			return packBM;
		}
		
		public double getPackBC()
		{
			return packBC;
		}
		

		
		public double getPackCC()
		{
			return packCC;
		}
		
		public double getPackAT()
		{
			return packAT;
		}
		
		public double getPackBT()
		{
			return packBT;
		}
		
		public double getPackCT()
		{
			return packCT;
		}
}