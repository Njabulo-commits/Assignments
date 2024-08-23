import javax.swing.JOptionPane;
public class RandomGuessMatchWithMethods {

    public static void main(String [] args)
    {
        final int MIN = 1; //Minimum value
        final int MAX = 10; //Maximum value
        int randomNumber = getRandomNumber(MIN, MAX); // Generate random number
        int num = requestNumber(); // Request user guess
        Boolean isEqual = randomNumber == num; // Check if guess is correct
        displayValues(num, isEqual, randomNumber); // Display the results
    }

    public static int getRandomNumber(int minimum, int maximum)
    {
        int randomNumber = minimum + (int)(Math.random() * maximum);
        return randomNumber;
    }

    public static int requestNumber()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter any number between 1 and 10"));
        return num;
    }

    public static void displayValues(int guess, Boolean isEqual, int randomNumber)
    {
        JOptionPane.showMessageDialog(null, "Your guess is " + isEqual);
        int difference = (guess - randomNumber) * -1;
        JOptionPane.showMessageDialog(null, "The number you guessed is " + guess + ", and the number generated was " + randomNumber + ".\n" +
                "The difference between them is " + difference);
    }
}
