
public class ArrayDemo8 {

	public static void main(String[] args){
		
			//declaring TWO dementional arrays
		double[][] studentsTests = new double[3][4];
		
		
			//initializing a two dementional arrays
		studentsTests[0][0] = 95;
		studentsTests[0][1] = 97;
		studentsTests[0][2] = 92;
		studentsTests[0][3] = 100;
		
		studentsTests[1][0] = 40;
		studentsTests[1][1] = 45;
		studentsTests[1][2] = 97;
		studentsTests[1][3] = 0;
		
		studentsTests[2][0] = 88;
		studentsTests[2][1] = 79;
		studentsTests[2][2] = 83;
		studentsTests[2][3] = 71;
		
			//using a two dementional array output
		for(int row = 0; row < studentsTests.length; row++) //.length number of rows
		{
			for(int col = 0; col < studentsTests[row].length; col++)
			{
				
				System.out.println(studentsTests[row][col]);
				
			}
		}
		
			//sum all elements
		int total = 0;
		int counter = 0;
		for(int row = 0; row < studentsTests.length; row++) //.length number of rows
		{
			for(int col = 0; col < studentsTests[row].length; col++)
			{
				
				total += studentsTests[row][col];
				counter++;
			}
		}
		System.out.println(total);
		
			//average
		double average = (double)total / counter;
		
		System.out.println(average);
	}
	
}
