import java.util.Scanner;
public class FormLetterWriter {

    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name>> ");
        firstName = input.nextLine();
        System.out.println("Enter your surname (Optional)>> ");
        lastName = input.nextLine();

        displaySalutation(firstName);
        if (!lastName.isEmpty()) {
            displaySalutation(firstName, lastName);
        }
        input.close();
    }

    public static void displaySalutation(String name)
    {
        System.out.println("Dear " + name + ". Thank you for your recent order");
    }

    public static void displaySalutation(String name, String surname)
    {
        System.out.println("Dear " + name + " " + surname + ". Thank you for your recent order");
    }
}
