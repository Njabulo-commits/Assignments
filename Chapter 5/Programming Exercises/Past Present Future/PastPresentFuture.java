/*
  a. Write an application that uses the LocalDate class to access the current date. Prompt a user for a month, day, and year. 
  Display a message that specifies whether the entered date is (1) not this year, 
  (2) in an earlier month this year, 
  (3) in a later month this year, 
  or (4) this month. Save the file as PastPresentFuture.java.
*/
import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {

    public static void main (String args[]){
        int day, month, year;
        int currentDay, currentMonth, currentYear;

        // Create localDate object with today's date
        LocalDate today = LocalDate.now();

        // Store the current year, month, and day in their respective variables.
        currentDay = today.getDayOfMonth();
        currentMonth = today.getMonthValue();
        currentYear = today.getYear();

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for a day, month , and year
        System.out.println("Enter a day (any value from 1-31)>>");
        day = input.nextInt();

        System.out.println("Enter a month (any value from 1-12)>> ");
        month = input.nextInt();

        System.out.println("Enter a year >> ");
        year = input.nextInt();

        if(year != currentYear){
            System.out.println("The date entered is not in the current year");
        }
        else{
            if(month < currentMonth)
            {
                System.out.println("The date entered is in an earlier month this year");
            } else if (month > currentMonth) {
                System.out.println("The date entered is in a later month this year");
            } else{
                System.out.println("The date entered is in this month");
            }
        }

    }
}
