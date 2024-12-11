/*
    2. a. Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists. In Chapter 4,
          you created a Rental class for the company. Now, make the following change to the class:

        - Currently, a rental price is calculated as $40 per hour plus $1 for each minute over a full hour.
          This means that a customer who rents equipment for 41 or more minutes past an hour pays more than a
          customer who waits until the next hour to return the equipment. Change the price calculation so that
          a customer pays $40 for each full hour and $1 for each extra minute up to and including 40 minutes.
          Save the file as `Rental`.java.
 */
public class Rental {
    public final static int MINUTES_PER_HOUR = 60;
    public final static double RENT_PER_HOUR = 40;

    private String contractNumber;
    private int hours; // hours of rental
    private int extraMinutes; // minutes over an hour
    private double price;

    public Rental(String contractNumber, int minutes){
        this.setContractNumber(contractNumber);
        this.setHoursAndMinutes(minutes);
    }
    public Rental(){
        this("A000", 0);
    }
    public void setContractNumber(String contractNumber){
        this.contractNumber = contractNumber;
    }

    public void setHoursAndMinutes(int minutes){
        hours = minutes/MINUTES_PER_HOUR;
        extraMinutes = minutes % MINUTES_PER_HOUR;
        if(extraMinutes <= 40)
        {
            price = hours * RENT_PER_HOUR + extraMinutes;
        }else{
            price = hours * RENT_PER_HOUR;
        }
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getHours(){
        return hours;
    }

    public int getExtraMinutes(){
        return extraMinutes;
    }

    public double getPrice(){
        return price;
    }

}

