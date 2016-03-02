
public class ChargeAccount {
	
			//Fields
	
		private static final int validNumbers[] = {5658845,4520125,7895122,8777541,8451277,1302850,
												   8080152,4562555,5552012,5050552,7825877,1250255,
									     		   1005231,6545231,3852085,7576651,7881200,4581002};
		
			//Accessor
		public static boolean getValidNumbers(int number)
		{	
			for (int i = 0; i < validNumbers.length; i++)
			{
				if ( validNumbers[i] == number )
				{
					return true;
				}
			}
			
			return false;
		}
	}
