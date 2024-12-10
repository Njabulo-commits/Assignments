/*
    1. Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists.
    Create a `Rental` class for the company. The `Rental` class contains the following:
    - Two public final static fields that hold the number of minutes in an hour (60) and the hourly rental rate ($40).
    - Four private fields that hold a contract number, number of hours for the rental, number of minutes over an hour, and the price.
      The contract number is stored as a String because the company plans to assign contract numbers such as K681.
    - Two public set methods. One sets the contract number (`setContractNumber()`). The other is named `setHoursAndMinutes()`,
      and it accepts the number of minutes for the rental and then sets the hours, extra minutes over an hour, and the total price.                                For example, 70 minutes is 1 hour and 10 minutes. The total price is $40 per hour plus $1 for every extra minute.
        - Four public get methods that return the values in the four non-static fields.
        - A constructor that accepts a contract number and number of minutes as parameters. Pass these values to the `setContractNumber()` and
          `setHoursAndMinutes()` methods, respectively. The `setHoursAndMinutes()` method will automatically calculate the hours, extra minutes,
           and price.
        - An overloaded default constructor that passes A000 and 0 to the two-parameter constructor.

        b. Create an application that declares two Rental objects.
        - One Rental object uses the default constructor.
        - The other Rental object is constructed from values input by a user. Display the details of each object by passing them, in turn, to a method
          named `displayDetails()`.
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
        this.hours = minutes/MINUTES_PER_HOUR;
        this.extraMinutes = minutes % MINUTES_PER_HOUR;
        this.price = hours * RENT_PER_HOUR + this.extraMinutes;
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

import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        // Create a Rental object using the default constructor
        Rental defaultRental = new Rental();

        // Create a Rental object using user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contract number: ");
        String contractNumber = scanner.nextLine();
        System.out.print("Enter rental duration in minutes: ");
        int totalMinutes = scanner.nextInt();

        Rental userRental = new Rental(contractNumber, totalMinutes);

        // Display details of both rentals
        System.out.println("\nDetails of default rental:");
        displayDetails(defaultRental);

        System.out.println("\nDetails of user rental:");
        displayDetails(userRental);
    }

    // Method to display rental details
    public static void displayDetails(Rental rental) {
        System.out.println("Contract Number: " + rental.getContractNumber());
        System.out.println("Hours: " + rental.getHours());
        System.out.println("Extra Minutes: " + rental.getExtraMinutes());
        System.out.println("Price: $" + rental.getPrice());
    }
}

