/* Create a class named TestLease whose main() method declares four Lease objects. Call a getData() method three times. Within the method, prompt a user
   for values for each field for a Lease, and return a Lease object to the main() method where it is assigned to one of main()’s Lease objects. Do not prompt the
   user for values for the fourth Lease object, but let it continue to hold the default values. Then, in main(), pass one of the Lease objects to a showValues()
   method that displays the data. Then call the addPetFee() method using the passed Lease object and confirm that the fee explanation statement is displayed. Next,
   call the showValues() method for the Lease object again and confirm that the pet fee has been added to the rent. Finally, call the showValues() method with each
   of the other three objects; confirm that two hold the values you supplied as input and one holds the constructor default values. Save the application as
   TestLease.java*/

import java.util.Scanner;
public class TestLease {
    public static Lease getData(Lease object)
    {
        Scanner input = new Scanner(System.in); // Scanner object

        System.out.println("Enter your name>> "); // Prompt for name
        String tenantName = input.nextLine();

        System.out.println("Enter your apartment number>> "); // Prompt for apartment number
        int apartmentNumber = input.nextInt();

        System.out.println("Enter the monthly rent amount>> "); // Prompt for rent
        double rent = input.nextDouble();

        System.out.println("Enter the term of the lease>> "); // Prompt for term
        int term = input.nextInt();
        input.close();

        object.setName(tenantName); // Set value for tenant name private field
        object.setApartmentNumber(apartmentNumber);
        object.setRent(rent); // Set value for rent private field
        object.setTerm(term);

        return object;
    }

    public static void showValues (Lease object)
    {
        System.out.println("Rental details for the tenant "+ object.getName() + ":" + "\n Apartment number - " + object.getApartmentNumber()
         + "\n Rent - " + "$" + object.getRent() + "\n Term of lease - " + object.getTerm() + " months");
    }

    public static void main(String[] args)
    {
        // Lease objects
        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        Lease lease3 = new Lease();
        Lease lease4 = new Lease();

        // Send copies of the lease objects to the getData Method.
        lease1 = getData(lease1);
        lease2 = getData(lease2);
        lease3 = getData(lease3);

        // Display data for the Lease objects
        showValues(lease1);
        lease1.addPetFee();
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);

    }
}

