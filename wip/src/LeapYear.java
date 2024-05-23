import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");

        // Read the user input as an integer representing the year
        int year = input.nextInt();

        // Determine if the entered year is a leap year
        // A leap year is divisible by 4 but not by 100, or it is divisible by 400
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Output the result based on whether the entered year is a leap year or not
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
