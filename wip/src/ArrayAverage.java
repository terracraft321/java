import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the average(int[] array) method
        System.out.println("Enter 10 integers:");
        int[] intArray = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Average of integers: " + average(intArray));

        // Test the average(double[] array) method
        System.out.println("Enter 10 double values:");
        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++) {
            try {
                doubleArray[i] = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid double value.");
                // Clear the invalid input
                scanner.next();
                // Decrement i to re-prompt for the same index
                i--;
            }
        }
        System.out.println("Average of double values: " + average(doubleArray));

        scanner.close();
    }

    // Method to calculate the average of an array of integers
    public static double average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Method to calculate the average of an array of doubles
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
