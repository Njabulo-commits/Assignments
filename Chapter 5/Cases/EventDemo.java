/*
    b. Write a program that demonstrates using the Event class as follows:
    - Instantiate three Event objects, and prompt the user for values for each object.
    - Display the details for all three objects.
    - Create a method that accepts two Event objects and returns the larger one based on the number of guests. (If the Events have the same number of
      guests, you can return either object.)
    - Call this method three times—once with each pair of instantiated Events—and display the event number and number of guests for each argument
      as well as the event number and number of guests for the larger Event.
 */
import java.util.Scanner;

public class EventDemo {
    private final static Scanner input = new Scanner(System.in);

    public static void displayDetails(Event event){
            String eventNumber = event.getEventNumber();
            int numGuests = event.getNumberOfGuests();
            double price = event.getEventPrice();
            System.out.println("The event number: " + eventNumber + " has " + numGuests + " guests" + " and will cost $" + price);
            System.out.println("------------------------------------------------------------------------------------------------");
    }

    public static String getEventNum(){
        System.out.println("Enter event number>> ");
        String eventNumber = input.nextLine().trim();
        return eventNumber;
    }

    public static int getNumGuest(){
        System.out.println("Enter the number of guests attending the event>> ");
        int guests = input.nextInt();
        input.nextLine(); // Clear buffer
        return guests;

    }

    public static Event compareEvents(Event event1, Event event2){
        if(event1.getNumberOfGuests() > event2.getNumberOfGuests()){
            return event1;
        }else
            return event2;
    }

    public static void compareAndDisplayEvents(Event event1, Event event2){
        Event largerEvent = compareEvents(event1, event2);
        System.out.println("\n Comparing events: ");
        displayDetails(event1);
        displayDetails(event2);
        System.out.println("The larger event is " + largerEvent.getEventNumber());
    }

    public static void main(String args[]){
            Event wedding1 = new Event(getEventNum(), getNumGuest());
            Event birthdayParty = new Event(getEventNum(), getNumGuest());
            Event babyShower = new Event(getEventNum(), getNumGuest());

            System.out.println("Details for wedding event: ");
            displayDetails(wedding1);
            System.out.println("Details for birthday event: ");
            displayDetails(birthdayParty);
            System.out.println("Details for baby shower event: ");
            displayDetails(babyShower);

            compareAndDisplayEvents(wedding1, birthdayParty);
            compareAndDisplayEvents(wedding1, babyShower);
            compareAndDisplayEvents(birthdayParty, babyShower);
    }
}

