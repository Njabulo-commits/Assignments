import java.util.Scanner;
public class YummyEventPrice {
    public static void main (String [] args)
    {
        final float PRICE_PER_GUEST = 35F;
        Scanner input = new Scanner(System.in);

        //Request of number of guest attending the event
        System.out.println("How many guests are attending this event? >> ");
        int numGuest = input.nextInt();

        //Compute the total price
        float totalPrice = numGuest * PRICE_PER_GUEST;

        //Display Company motto
        System.out.println("*********************************************");
        System.out.println("*Yummy makes the food that makes it a party.*");
        System.out.println("*********************************************");

        //Display number of guest, price per guest, and total price.
        System.out.println("The number of guests is " + numGuest);
        System.out.println("The price per guest amounts to " + PRICE_PER_GUEST);
        System.out.println("The total cost is $" + totalPrice);

        // Display if the Job is a large event
        Boolean IsLarge = numGuest >= 50;
        System.out.println(IsLarge);

    }
}
