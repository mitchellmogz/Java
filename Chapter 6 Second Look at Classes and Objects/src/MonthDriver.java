
import java.util.Scanner;

public class MonthDriver
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        
         
        Month defaultMonth = new Month();
        Month intMonth = new Month(getIntInput("Enter number of Month "));
        Month stringMonth = new Month(getStringInput("Enter name of Month "));

        // print out months selected by calling the toString methods
        System.out.println(defaultMonth.toString());
        System.out.println(intMonth.toString());
        System.out.println(stringMonth.toString());

        // compare month values
        System.out.println("\nTesting comparisons: ");

        // tests default month equal to integer month
        if(defaultMonth.equals(intMonth))
        {
            System.out.println("defaultMonth is equal to intMonth");
        }
        else
        {
            System.out.println("defaultMonth is not equal to intMonth");
        }

        // tests integer month is greater that string month
        if(intMonth.greaterThan(stringMonth))
        {
            System.out.println("intMonth is greater than stringMonth");
        }
        else
        {
            System.out.println("intMonth is not greater than stringMonth");
        }

        // tests string month is less than default month
        if(stringMonth.lessThan(defaultMonth))
        {
            System.out.println("How did that happen???");
        }
        else
        {
            System.out.println("stringMonth is not less than defaultMonth");
        }

        System.out.println("\nCompleted comparisons ");
    }

    public static int getIntInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.nextInt();
    }

    public static String getStringInput(String stringIn)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(stringIn);
        return keyboard.next();
    }

}