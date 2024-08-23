/*
Yummy Catering provides meals for parties and special events. In Chapter 2, you wrote an application that 
prompts the user for the number of guests attending an event, displays the company motto with a border, and 
then displays the price of the event and whether the event is a large one. Now modify the program so that the 
main() method contains only three executable statements that each call a method as follows:
❯ The first executable statement calls a public static int method that prompts the user for the 
number of guests and returns the value to the main() method.
❯ The second executable statement calls a public static void method that displays the company 
motto with the border.
❯ The last executable statement passes the number of guests to a public static void method that 
computes the price of the event, displays the price, and displays whether the event is a large event.
Save the file as YummyEventPriceWithMethods.java
*/
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
