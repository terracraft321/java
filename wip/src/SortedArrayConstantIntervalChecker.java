import java.util.InputMismatchException;
import java.util.Scanner;

public class SortedArrayConstantIntervalChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the list of integers
        System.out.println("Enter list:");

        // Read the number of elements in the list
        int size = scanner.nextInt();

        // Create an array to store the list of integers
        int[] list = new int[size];

        // Read the elements of the list
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        // Check if the list is sorted with a constant interval
        boolean sorted = isSortedConstantInterval(list);

        // Display the result
        if (sorted) {
            System.out.println("The list is sorted with a constant interval.");
        } else {
            System.out.println("The list is not sorted with a constant interval.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if the array is sorted with a constant interval
    public static boolean isSortedConstantInterval(int[] list) {
        if (list.length <= 1) {
            return true;
        }

        // Calculate the interval between elements
        int interval = list[1] - list[0];

        // Check if all elements have the same interval
        for (int i = 1; i < list.length; i++) {
            if (list[i] - list[i - 1] != interval) {
                return false;
            }
        }

        return true;
    }
}
