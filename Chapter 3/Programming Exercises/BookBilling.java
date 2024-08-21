import java.util.Scanner;

public class BookBilling {
    private static final double BOOK_PRICE = 14.99;
    private static final double TAX_RATE = 0.08;

    public static double computeBill()
    {
        double subtotal = BOOK_PRICE;
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }

    // Calculate the price of more than one book
    public static double computeBill(int quantity)
    {
        double subtotal = BOOK_PRICE * quantity;
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }

    // Calculate the price of one or more books with a coupon value
    public static double computeBill(int quantity, double coupon)
    {
        double subtotal = BOOK_PRICE * quantity;
        double discountedSubtotal = Math.max(subtotal - coupon, 0); // Ensure non-negative subtotal
        double tax = discountedSubtotal * TAX_RATE;
        return discountedSubtotal + tax;
    }

    public static void main(String[] args)
    {
        int numBooks;
        double couponValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of books ordered>> ");
        numBooks = input.nextInt();

        System.out.println("Enter coupon value (Optional)>> ");
        couponValue = input.nextDouble();

        // Test the first overloaded method (no parameters)
        System.out.println("Cost of one book (no discount): $" + String.format("%.2f", computeBill()));

        // Test the second overloaded method (with quantity)
        System.out.println("Cost of " + numBooks + " books (no discount): $" + String.format("%.2f", computeBill(numBooks)));

        // Test the third overloaded method (with quantity and coupon)
        System.out.println("Cost of " + numBooks + " books with $" + couponValue + " discount: $" + String.format("%.2f", computeBill(numBooks, couponValue)));

        input.close();

    }


}
