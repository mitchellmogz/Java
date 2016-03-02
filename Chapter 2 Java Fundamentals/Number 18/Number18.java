// Programming Challenge Number 18

public class Number18
{
	public static void main(String[] args)
	{
		
		double numberShares;
		double boughtPrice;
		double soldPrice;
		double commissionTotal;
		double commission;
		double commissionBoughtPrice;
		double commissionSoldPrice;
		double totalPriceBought;
		double totalPriceSold;
		double profit;
		double profitTotal;
		
		numberShares = 1000;
		boughtPrice = 32.87;
		soldPrice = 33.92;
		commission = 0.02;
			
		//Calculations
		totalPriceBought = numberShares * boughtPrice;
		commissionBoughtPrice = totalPriceBought * commission;
		totalPriceSold = numberShares * soldPrice;
		commissionSoldPrice = totalPriceSold * commission;
		profit = totalPriceSold - totalPriceBought;
		commissionTotal = commissionSoldPrice + commissionBoughtPrice;
		profitTotal = profit - commissionTotal;
		
		//Display Ingredients
		System.out.printf("\nJoe paid $%,.2f to purchase the stock.",totalPriceBought);
		System.out.printf("\nJoe paid $%,.2f to pay the commission purchase price.",commissionBoughtPrice);
		System.out.printf("\nJoe sold the stock for $%,.2f.",totalPriceSold);
		System.out.printf("\nJoe paid $%,.2f to pay the commission selling price.",commissionSoldPrice);
		System.out.printf("\nJoe made $%,.2f after paying the commission fees.",profitTotal);
	}
}