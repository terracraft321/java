import java.util.Scanner;

public class badcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = 0;
        boolean validInput = false;

        // Prompt the user to enter the amount
        while (!validInput) {
            try {
                System.out.print("Enter the amount as a decimal number, such as 11.56: ");
                String input = scanner.nextLine();
                amount = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }

        // Convert the amount into cents
        int cents = (int) (amount * 100);

        // Calculate dollars
        int dollars = cents / 100;
        cents %= 100;

        // Calculate quarters
        int quarters = cents / 25;
        cents %= 25;

        // Calculate dimes
        int dimes = cents / 10;
        cents %= 10;

        // Calculate nickels
        int nickels = cents / 5;
        cents %= 5;

        // Pennies
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
