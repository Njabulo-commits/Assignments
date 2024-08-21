/** The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium
 *is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360, which is calculated
 *by adding the decades (3) to 15, and then multiplying by 20. Write an application that prompts a user for the current year and a birth year.
 *Pass both to a method that calculates and returns the premium amount, and then display the returned amount. Save the application as Insurance.java.*/
import java.util.Scanner;
public class Insurance {
    public static void main(String [] args)
    {
        int currentYear;
        int birthYear;
        int premiumAmount;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current year>> ");
        currentYear = input.nextInt();

        System.out.println("Enter birth year>> ");
        birthYear = input.nextInt();
        input.close();

        premiumAmount = computeAmount(currentYear, birthYear);
        System.out.println("Your annual monthly policy premium amounts to $" + premiumAmount);
    }

    public static int computeAmount(int currentYear, int birthYear)
    {
        int decades;
        int premium;

        decades = (currentYear - birthYear)/10;
        premium = (decades + 15) * 20;
        return premium;
    }
}

