import java.util.Scanner;

public class SortedArrayChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a list of integers
        System.out.println("Enter list: ");
        int n = scanner.nextInt(); // Read the number of elements in the list
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        // Check if the list is sorted
        if (isSorted(list)) {
            System.out.println("The list is sorted");
        } else {
            System.out.println("The list is not sorted");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if an array is sorted in ascending order
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
