import java.util.Scanner;

/*
    In this section, you start writing a program for Sacks Fifth Avenue, a nonprofit thrift shop.
    The program determines which volunteer to assign to price a donated item. To begin, you prompt the user to answer a
    question about whether a donation is clothing or some other type, and then the program displays the name of the
    volunteer who handles such donations. Clothing donations are handled by Regina, and other donations are handled by Marco.
 */
public class AssignVolunteer {
    public static void main(String[] args)
    {
        int donationType; // Represents the donation type
        String volunteer; // Represents the volunteer
        final int CLOTHING_CODE = 1; // Constant that
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.println("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE +
                  " for anything else..."); // Prompt the user to enter a 1 or 2 for Donation type.
        donationType = input.nextInt();
        input.close();

        // If-else statement that will choose the name of the volunteer to be assigned to the volunteer String
        if(donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else
            volunteer = OTHER_PRICER;

        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}
