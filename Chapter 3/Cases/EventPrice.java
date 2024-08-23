import java.util.Scanner;

public class EventPrice {
    private static final float PRICE_PER_GUEST = 35F;
    public static void main(String[] args)
    {
        int numGuests = promptForNumOfGuests();
        displayMotto();
        computeAndDisplayPrice(numGuests);

    }

    public static int promptForNumOfGuests()
    {
        //Request of number of guest attending the event
        Scanner input = new Scanner(System.in);
        System.out.println("How many guests are attending this event? >> ");
        int numGuest = input.nextInt();
        input.close();
        return numGuest;
    }

    public static void displayMotto()
    {
        //Display Company motto
        System.out.println("*********************************************");
        System.out.println("*Yummy makes the food that makes it a party.*");
        System.out.println("*********************************************");
    }

    public static void computeAndDisplayPrice(int numGuest)
    {
        //Compute the total price
        float totalPrice = numGuest * PRICE_PER_GUEST;

        //Display number of guest, price per guest, and total price.
        System.out.println("The number of guests is " + numGuest);
        System.out.println("The price per guest amounts to " + PRICE_PER_GUEST);
        System.out.println("The total cost is $" + totalPrice);

        // Display if the Job is a large event
        Boolean IsLarge = numGuest >= 50;
        System.out.print("Large Event>> " );
        System.out.print(IsLarge);
    }
}
