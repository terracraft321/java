import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEndOfInput {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        try {
            // Read an initial data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            int data = input.nextInt();

            // Keep reading data until the input is 0
            int sum = 0;
            while (data != 0) {
                sum += data;

                // Read the next data
                System.out.print("Enter an integer (the input ends if it is 0): ");
                data = input.nextInt();
            }

            // Output the sum
            System.out.println("The sum is " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            // Consume the invalid input to avoid infinite loop
            input.next();
        } finally {
            // Close the scanner to avoid resource leaks
            input.close();
        }
    }
}
