public class YummyMotto {

    public static void main(String[] args)
    {
        String motto = "Yummy makes the food that make it a party";

        int borderLength = motto.length() + 2; // Add 4 asterisks on  each side of the motto
        //Print top border
        System.out.println("*".repeat(borderLength));

        // Print the motto with asterisks for padding
        System.out.println("*" + motto + "*");

        //Print the bottom border
        System.out.println("*".repeat(borderLength));
    }
}
