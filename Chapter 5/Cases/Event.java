/*
    1. a. Yummy Catering provides meals for parties and special events. In Chapter 4, you created an Event class for the company.
          Now, make the following changes to the class:
        - Currently, the class contains a constant for the price per guest ($35) that is used for every guest. Replace that constant field with
          two constant fields—a lower price per guest that is $32 and a higher price per guest that is $35.
        - Add a new method named isLargeEvent() that returns true if the number of guests is 50 or greater and otherwise returns false.
        - Modify the method that sets the number of guests so that a large Event (more than 50 guests) uses the lower price per guest to set the
          field that holds the price per guest and to calculate the total Event price. A small Event uses the higher price.
 */
public class Event {
    public final static double MAX_PRICE_PER_GUEST = 35.00; // higher price per guest
    public final static double MIN_PRICE_PER_GUEST = 32.00; // lower price per guest
    public final static int LARGE_EVENT = 50;
    private String eventNumber;
    private int numberOfGuests;
    private double eventPrice;
    private double pricePerGuest;

    public Event(String eventNumber, int numberOfGuests){
        this.setEventNumber(eventNumber);
        this.setGuests(numberOfGuests);
    }

    // Default constructor
    public Event(){
        eventNumber = "A000";
        numberOfGuests = 0;
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setGuests(int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
        if(isLargeEvent()){
            pricePerGuest = MIN_PRICE_PER_GUEST;
        }
        else{
            pricePerGuest = MAX_PRICE_PER_GUEST;
        }
    }

    public int getNumberOfGuests(){
        return numberOfGuests;
    }

    public String getEventNumber(){return eventNumber;}
    public double getEventPrice(){
        eventPrice = numberOfGuests * pricePerGuest;
        return eventPrice;
    }

    // Confirm if event is large or not
    public boolean isLargeEvent(){
        if(this.getNumberOfGuests() >= LARGE_EVENT){
            return true;
        }
        else{
            return false;
        }
    }
}

