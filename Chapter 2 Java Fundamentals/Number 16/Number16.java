// Programming Challenge Number 16

public class Number16
{
	public static void main(String[] args)
	{
		
		double customers;
		double weeklyPercent;
		double customersWeekly;
		double citrusPercent;
		double surveyTotal;
		
		customers = 15000;
		weeklyPercent = 0.18;
		citrusPercent = 0.58;
		
		//Calculations
		customersWeekly = customers * weeklyPercent;
		surveyTotal = customersWeekly * citrusPercent;
		weeklyPercent = weeklyPercent * 100;
		citrusPercent = citrusPercent * 100;
				
		//Display Ingredients
		System.out.printf("\nEnergy Drink Company surveyed %,.0f people.\n",customers);
		System.out.printf("\nOf those customers %,.0f, or %.0f Percent, of those customers bought one weekly.\n",customersWeekly,weeklyPercent);
		System.out.printf("\nThe customers who bought one weekly, %,.0f, or %.0f Percent, preferred a citrus flavour.\n",surveyTotal,citrusPercent);
	}
}