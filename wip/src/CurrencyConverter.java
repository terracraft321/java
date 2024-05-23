import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount
        double amount = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                // Prompt user to enter the amount as a decimal number
                System.out.print("Enter the amount as a decimal number, such as 11.56: ");
                String input = scanner.nextLine();
                // Parse the input string to a double
                amount = Double.parseDouble(input);
                validInput = true; // Set validInput to true if input is successfully parsed
            } catch (NumberFormatException e) {
                // Catch NumberFormatException if input is not a valid decimal number
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }

        // Convert the amount into cents
        int cents = (int) (amount * 100);

        // Calculate dollars
        int dollars = cents / 100;
        cents %= 100; // Calculate the remaining cents

        // Calculate quarters
        int quarters = cents / 25;
        cents %= 25; // Calculate the remaining cents

        // Calculate dimes
        int dimes = cents / 10;
        cents %= 10; // Calculate the remaining cents

        // Calculate nickels
        int nickels = cents / 5;
        cents %= 5; // Calculate the remaining cents

        // Calculate pennies
        int pennies = cents;

        // Display the result
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        // Close the scanner
        scanner.close();
    }
}
