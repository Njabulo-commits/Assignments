/*
    1. Create a class to hold Event data for Yummy Catering. The class contains the following:
    - Two public final static fields that hold the price per guest ($35) and the cutoff value for a large event (50 guests).
    - Three private fields that hold an event number, number of guests for the event, and the price.
      The event number is stored as a String because the company plans to assign event numbers such as M312.
    - Two public set methods that set the event number (`setEventNumber()`) and the number of guests (`setGuests()`).
      The price does not have a set method because the `setGuests()` method will be used calculate the price as the number of guests multiplied
      by the price per guest every time the number of guests is set.
    - Three public get methods that return the values in the three non-static fields.
    - A constructor that accepts an event number and number of guests as parameters.
      Pass these values to the `setEventNumber()` and `setGuests()` methods, respectively. The `setGuests()` method will automatically
      calculate the event price.
    - Another constructor that is a default constructor that passes A000 and 0 to the two parameter constructor.
 */
public class Event {
    public final static double PRICE_PER_GUEST = 35;
    public final static int GUEST_LIMIT = 50;
    private String eventNumber;
    private int numberOfGuests;
    private double price;

    public Event(String eventNumber, int numberOfGuests){
        this.setEventNumber(eventNumber);
        this.setGuests(numberOfGuests);
    }

    public Event(){
        eventNumber = "A000";
        numberOfGuests = 0;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setGuests(int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests(){
        return numberOfGuests;
    }

    public String getEventNumber(){return eventNumber;}
     public double getPrice(){
        price = numberOfGuests * PRICE_PER_GUEST;
        return price;
    }
}

/*
    Create an application that declares two `Event` objects.
    - One Event object uses the default constructor.
    - The other Event object is constructed from values input by a user.
    Display the details of each object by passing them, in turn, to a method named `displayDetails()`
 */
public class EventDemo {
    public static void displayDetails(Event event){
        String eventNumber = event.getEventNumber();
        int numGuests = event.getNumberOfGuests();
        double price = event.getPrice();

        System.out.println("The event number: " + eventNumber + " has " + numGuests + " guests" + "and will cost $" + price);
    }

    public static void main(String args[]){
        Event wedding1 = new Event();
        Event wedding2 = new Event("MB5403", 49);

        displayDetails(wedding1);
        displayDetails(wedding2);
    }
}
