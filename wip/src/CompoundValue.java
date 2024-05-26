import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter amount, annual interest rate, and number of months
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of months: ");
        int numberOfMonths = scanner.nextInt();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // Initialize the total amount in the savings account
        double totalAmount = 0;

        // Calculate the amount in the savings account after each month
        for (int i = 1; i <= numberOfMonths; i++) {
            totalAmount = (totalAmount + monthlySavingAmount) * (1 + monthlyInterestRate);
        }

        // Display the total amount in the savings account
        System.out.printf("After %d months, the amount in the savings account is: $%.2f%n", numberOfMonths, totalAmount);
    }
}
