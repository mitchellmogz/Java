import java.util.Scanner;// Challenge Number 14

public class Number14
{
	public static void main(String[] args)
	{
		double stockAmount;
		double stockPrice;
		double stockComTotal;
		double stockCom;
		double stockTotal;
		double stockTotalPlus;
		
		stockAmount = 1000;
		stockPrice = 25.5;
		stockCom = 0.02;
		
		// Calulation
		stockTotal = stockAmount * stockPrice;
		stockComTotal = stockTotal * stockCom;
		stockTotalPlus = stockTotal + stockComTotal;	
		
		//Display with %f
		System.out.printf("\nThe total price without commission is $%,.2f.\n",stockTotal);
		System.out.printf("The total commission price is $%,.2f.\n",stockComTotal);
		System.out.printf("The total price with commission is $%,.2f.\n",stockTotalPlus);
	}
}