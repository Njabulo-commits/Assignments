/*
To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10 times
the student’s grade point average. In other words, a student with a 3.2 grade point average receives a $32 credit.
Create a class that prompts a student for a name and grade point average and then passes the values to a method
that displays a descriptive message. The message uses the student’s name, echoes the grade point average, and
computes and displays the credit. Save the application as BookstoreCredit.java.
 */

import java.util.Scanner;
public class BookstoreCredit {

    public static void main(String[] args)
    {
        String name;
        double studentGPA;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name>> ");
        name = input.nextLine();

        System.out.println("Enter your grade point average >> ");
        studentGPA = input.nextDouble();

        displayCredits(name, studentGPA);
    }

    public static void displayCredits(String name, double studentGPA)
    {
        double bookstoreCredit;
        bookstoreCredit = studentGPA * 10;
        System.out.print("Hi " + name + ". With a GPA of " + studentGPA + " your credit amounts to $" + bookstoreCredit);
    }
}
