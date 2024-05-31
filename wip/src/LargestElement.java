import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter ten numbers
        System.out.println("Enter ten numbers:");

        // Create an array to store the numbers entered by the user
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Find the maximum value in the array
        double max = max(numbers);

        // Display the maximum value
        System.out.println("The maximum value is: " + max);

        // Close the scanner
        scanner.close();
    }

    // Method to find the largest element in an array of double values
    public static double max(double[] array) {
        // Initialize max to the first element of the array
        double max = array[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Return the maximum value
        return max;
    }
}
