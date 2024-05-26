import java.util.Scanner;

public class Idkbromabnabn {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables to store the entered number and the maximum number
        int number, max;

        // Prompt the user to enter the first number
        System.out.print("Enter a number (0 to end): ");

        // Read the first number entered by the user
        number = input.nextInt();

        // Initialize the maximum number to the first number entered
        max = number;

        // Start a do-while loop to read and process subsequent numbers until 0 is entered
        do {
            // Prompt the user to enter the next number
            System.out.print("Enter a number (0 to end): ");

            // Read the next number entered by the user
            number = input.nextInt();

            // Check if the current number is greater than the current maximum
            if (number > max)
                // If so, update the maximum number
                max = number;
        } while (number != 0); // Continue looping until the user enters 0

        // Display the maximum number entered by the user
        System.out.println("Maximum number entered: " + max);

        // Close the Scanner to release system resources
        input.close();
    }
}
