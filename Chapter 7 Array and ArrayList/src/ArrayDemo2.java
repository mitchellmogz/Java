
public class ArrayDemo2 {

	public static void main (String[] args)
	{
			//shorthand
		int[] values = {23, 645, 19841, 156, 456, 123, 446, 447};
		
		String[] name = {"bill", "bert", "bob"};
		
			//bill
		System.out.println(name[0]);
		
			//bert
		System.out.println(name[1]);
		
			//156
		System.out.println(values[3]);
	
			//arrays
		double[] myNumbers, yourNumbers;
		
			//vs num1 array num2 double
		double nums1[],nums2;
		
			//equations
		double grossPay = values[0] * 2;
			
			//Display equation
		System.out.println("Gross Pay: " + grossPay);
		
			//Display increment
		System.out.println(++values[0]);
		
			//Display conditional
		if(values[0] > values[1])
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("Not True");
		}
		
			//Display loop
		while(values[0] != 20)
		{
			System.out.println(values[0]);
			--values[0];
		}
		
			//length field is a public value associated with arrays
		System.out.println("The names array has " + name.length);
		
			//short hand for loop read only
		for(int num : values)
		{
			System.out.println(num);
		}
		
	}
	
}
