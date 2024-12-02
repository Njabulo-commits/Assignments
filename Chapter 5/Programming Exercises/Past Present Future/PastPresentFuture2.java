/*
  b. Use the Web to learn how to use the LocalDate Boolean methods isBefore(), isAfter(), and equals(). Use your knowledge to write a program that 
  prompts a user for a month, day, and year, and then displays a message specifying whether the entered day is in the past, the current date, or in the future. 
  Save the file as PastPresentFuture2.java.
*/
import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main (String args[]){
        int day, month, year;

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for a day, month , and year
        System.out.println("Enter a day (any value from 1-31)>>");
        day = input.nextInt();

        System.out.println("Enter a month (any value from 1-12)>> ");
        month = input.nextInt();

        System.out.println("Enter a year >> ");
        year = input.nextInt();

        // Create localDate objects
        LocalDate today = LocalDate.now();
        LocalDate specifiedDate = LocalDate.of(year, month, day);

        
        if(specifiedDate.isBefore(today)){
            System.out.println("The date entered(" + specifiedDate + ") is in the past");
        }
        else if(specifiedDate.isAfter(today)){
            System.out.println("The date entered(" + specifiedDate + ") is in the future");
        }
        else if(specifiedDate.equals(today)){
            System.out.println("The date entered(" + specifiedDate + ") is today");
        }
    }
}
