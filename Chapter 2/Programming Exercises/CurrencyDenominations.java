import java.util.Scanner;
public class CurrencyDenominations {
    public static void main(String[] args)
    {
        final float TWENTY_DOLLARS = 20.00F;
        final float TEN_DOLLARS = 10.00F;
        final float FIVE_DOLLARS = 5.00F;
        final float ONE_DOLLAR = 1.00F;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter amount in dollars >> ");
        float numDollars = input.nextInt();

        int numTwenties = (int)(numDollars/TWENTY_DOLLARS);
        // Get the remaining amount after dividing by 20 and store it back in numDollars for further calculations.
        numDollars = numDollars % TWENTY_DOLLARS;

        int numTens = (int)(numDollars/TEN_DOLLARS);
        // Get the remaining amount after dividing by 10 and store it back in numDollars for further calculations.
        numDollars %= TEN_DOLLARS;

        int numFives = (int)(numDollars/FIVE_DOLLARS);
        // Get the remaining amount after dividing by 5 and store it back in numDollars for further calculations.
        numDollars %= FIVE_DOLLARS;

        int numOnes = (int)(numDollars/ONE_DOLLAR);

        int r = 5 % 10;

        System.out.println("You can provide the amount in: ");
        System.out.println(numTwenties + " $20 dollar bill(s)");
        System.out.println(numTens + " $10 dollar bill(s)");
        System.out.println(numFives + " $5 dollar bill(s)");
        System.out.println(numOnes + " $1 dollar bill(s)");
        System.out.println(r);
    }

}
