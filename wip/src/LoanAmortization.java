import java.util.Scanner;

public class LoanAmortization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter loan details
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Calculate monthly interest rate and number of payments
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfPayments = numberOfYears * 12;

        // Calculate monthly payment using the formula for loan amortization
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Display header for the amortization schedule
        System.out.println("\nAmortization Schedule:");
        System.out.printf("%-10s%-15s%-15s%-15s%s\n", "Month", "Payment", "Principal", "Interest", "Balance");

        // Calculate and display amortization schedule for each month
        double remainingBalance = loanAmount;
        for (int month = 1; month <= numberOfPayments; month++) {
            // Calculate interest and principal for the month
            double interest = monthlyInterestRate * remainingBalance;
            double principal = monthlyPayment - interest;

            // Update remaining balance
            remainingBalance -= principal;

            // Display payment details for the month
            System.out.printf("%-10d$%-14.2f$%-14.2f$%-14.2f$%.2f\n", month, monthlyPayment, principal, interest, remainingBalance);
        }
    }
}
