import java.util.Scanner;
public class SunshineRentalPrice {
    private static final float RENTAL_COST_PER_HOUR = 40.00F;
    private static final float ADDITIONAL_COST_PER_MIN = 1.00F;
    public static void main(String[] args)
    {
        int minKept = requestMinutes();
        displayMotto();
        computeTimeAndPrice(minKept);
    }

    public static int requestMinutes()
    {
        Scanner input = new Scanner(System.in);
        int minKept;

        System.out.println("For how many minutes have you kept the item >> ");
        minKept = input.nextInt();
        return minKept;
    }

    public static void displayMotto()
    {
        String motto = "Sunshine Seashore really makes it a lot more enjoyable in the sun.";
        int borderLength = motto.length() + 2;

        // Print top border
        System.out.println("*".repeat(borderLength));

        // Print motto with Asterisks for padding
        System.out.println("*" + motto + "*");

        // Print bottom border
        System.out.println("*".repeat(borderLength));
    }

    public static void computeTimeAndPrice(int minutes )
    {
        // Calculate the full hours
        int hoursKept = minutes/60;
        // Calculate additional remaining minutes
        int extraMinutes = minutes%60;
        // Calculate the total cost for the full hours and additional minutes
        float totalCost = (RENTAL_COST_PER_HOUR * hoursKept) + (ADDITIONAL_COST_PER_MIN * extraMinutes);

        System.out.println("You have kept the item for " + hoursKept + " hour(s) and " + extraMinutes + " minute(s)");
        System.out.println("The total cost is $" + totalCost);
    }
}
