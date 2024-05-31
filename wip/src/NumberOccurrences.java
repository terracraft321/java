import java.util.Scanner;

public class NumberOccurrences {
    public static void main(String[] args) {
        // Initialize an array to store occurrences of numbers from 1 to 50
        int[] occurrences = new int[51]; // Index 0 is unused, so we need an array of size 51

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter integers
        System.out.println("Enter integers between 1 and 50 (enter 0 to end input):");

        // Read integers until the user enters 0
        int number;
        do {
            number = scanner.nextInt();
            // Increment the count for the entered number if it's between 1 and 50
            if (number >= 1 && number <= 50) {
                occurrences[number]++;
            }
        } while (number != 0);

        // Display the occurrences of each number
        for (int i = 1; i <= 50; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + " occurs " + occurrences[i] + (occurrences[i] == 1 ? " time" : " times"));
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
