import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        // Prompt the user to enter the coefficients of the quadratic equation
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");

        // Read input from the user
        try {
            // Read the coefficients
            a = readDouble(scanner);
            b = readDouble(scanner);
            c = readDouble(scanner);

            // Solve the quadratic equation
            solveQuadraticEquation(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric coefficients.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to read a double value from the user with error checking
    private static double readDouble(Scanner scanner) {
        while (true) {
            try {
                // Attempt to read a double value
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                // Clear the scanner buffer
                scanner.next();
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        }
    }

    // Method to solve the quadratic equation and display the roots
    private static void solveQuadraticEquation(double a, double b, double c) {
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            // No real roots (complex roots)
            System.out.println("No real roots. Roots are complex.");
        }
    }
}
