/*
  Write a program that demonstrates using the Rental class as follows:

- Instantiate three Rental objects, and prompt the user for values for each object.
- Display the details for each object to verify that the new price calculation works correctly.
- Create a method that accepts two Rental objects and returns the one with the longer rental time. (If the Rentals have the same time, you can return either object.) 
  Call this method three times—once with each pair of instantiated Rentals—and display the contract number and time in hours and minutes for each argument as well as the 
  contract number of the longer Rental. Save the file as `RentalDemo.java`
*/
import java.util.Scanner;
public class RentalDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Sunshine Seashore Supplies!");
        Rental rental1 = new Rental(getContractNumber(), getMinutes());
        Rental rental2 = new Rental(getContractNumber(), getMinutes());
        Rental rental3 = new Rental(getContractNumber(), getMinutes());

        // Display details of both rentals
        System.out.println("\nDetails of user1 rental:");
        displayDetails(rental1);
        System.out.println("\nDetails of user2 rental:");
        displayDetails(rental2);
        System.out.println("\nDetails of user3 rental:");
        displayDetails(rental3);

        // Display which user has the longest rental time
        compareAndDisplay(rental1, rental2);
        compareAndDisplay(rental1, rental3);
        compareAndDisplay(rental2, rental3);
    }

    // Method to display rental details
    public static void displayDetails(Rental rental) {
        System.out.println("---------------------------------------------");
        System.out.println("Contract Number: " + rental.getContractNumber());
        System.out.println("Hours: " + rental.getHours());
        System.out.println("Extra Minutes: " + rental.getExtraMinutes());
        System.out.println("Price: $" + rental.getPrice());
        System.out.println("---------------------------------------------");
    }

    public static String getContractNumber(){
        Scanner input = new Scanner(System.in);
        // Get contract number using user input
        System.out.print("Enter contract number: ");
        String contractNumber = input.nextLine();
        return contractNumber;
    }

    public static int getMinutes(){
        Scanner input = new Scanner(System.in);
        // Get rental duration using user input
        System.out.println("Enter rental duration in minutes:");
        int totalMinutes = input.nextInt();
        return totalMinutes;
    }

    // Compare two rental object
    public static Rental compareRentals(Rental rental1, Rental rental2){
        int rentalTime1 = rental1.getHours() * Rental.MINUTES_PER_HOUR + rental1.getExtraMinutes();
        int rentalTime2 = rental2.getHours() * Rental.MINUTES_PER_HOUR + rental2.getExtraMinutes();
        if(rentalTime1 > rentalTime2){
            return rental1;
        }
        else {
            return rental2;
        }
    }

    // Compare rentals and display the longer rental
    public static void compareAndDisplay(Rental rental1, Rental rental2){
        Rental longerRental = compareRentals(rental1, rental2);
        System.out.println("\nComparing rentals:");
        displayDetails(rental1);
        displayDetails(rental2);
        System.out.println("The longer rental is: " + longerRental.getContractNumber());
    }
}
