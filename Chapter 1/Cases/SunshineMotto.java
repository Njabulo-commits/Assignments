import java.util.Scanner;
public class SunshineMotto
{
    public static void main(String[] args)
    {
        final float RENTAL_COST_PER_HOUR = 40.00F;
        final float ADDITIONAL_COST_PER_MIN = 1.00F;
        Scanner input = new Scanner(System.in);

        String motto = "Sunshine Seashore really makes it a lot more enjoyable in the sun.";
        int borderLength = motto.length() + 2;

        // Print top border
        System.out.println("*".repeat(borderLength));

        // Print motto with Asterisks for padding
        System.out.println("*" + motto + "*");

        // Print bottom border
        System.out.println("*".repeat(borderLength));

        // Request for number of minutes user has rented the sports equipment
        System.out.println("For how many minutes have you kept the item >> ");
        int minKept = input.nextInt();

        // Calculate the full hours
        int hoursKept = minKept/60;

        // Calculate additional remaining minutes
        int extraMinutes = minKept%60;

        // Calculate the total cost for the full hours and additional minutes
        float totalCost = (RENTAL_COST_PER_HOUR * hoursKept) + (ADDITIONAL_COST_PER_MIN * extraMinutes);

        System.out.println("You have kept the item for " + hoursKept + " hour(s) and " + extraMinutes + " minute(s)");
        System.out.println("The total cost is $" + totalCost);
    }
}
