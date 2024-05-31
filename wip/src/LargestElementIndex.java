import java.util.Scanner;

public class LargestElementIndex {
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

        // Find the index of the largest element in the array
        int index = indexOfLargestElement(numbers);

        // Display the index and the largest element
        System.out.println("The index of the largest element is: " + index);
        System.out.println("The largest element is: " + numbers[index]);

        // Close the scanner
        scanner.close();
    }

    // Method to find the index of the largest element in an array of double values
    public static int indexOfLargestElement(double[] array) {
        // Initialize maxIndex to 0
        int maxIndex = 0;

        // Iterate through the array to find the index of the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Return the index of the largest element
        return maxIndex;
    }
}
