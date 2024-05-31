import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");

        // Create an array to store the numbers entered by the user
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the least common multiple of the numbers
        int lcmResult = lcm(numbers);

        // Display the least common multiple
        System.out.println("The least common multiple is: " + lcmResult);

        // Close the scanner
        scanner.close();
    }

    // Method to compute the least common multiple of an unspecified number of integers
    public static int lcm(int... numbers) {
        // Initialize lcmResult to the first number
        int lcmResult = numbers[0];

        // Iterate through the numbers to find the least common multiple
        for (int num : numbers) {
            lcmResult = calculateLCM(lcmResult, num);
        }

        // Return the least common multiple
        return lcmResult;
    }

    // Method to calculate the least common multiple of two numbers
    public static int calculateLCM(int a, int b) {
        // Calculate the greatest common divisor (GCD) using Euclid's algorithm
        int gcd = calculateGCD(a, b);

        // Calculate the least common multiple (LCM) using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        return (a * b) / gcd;
    }

    // Method to calculate the greatest common divisor (GCD) of two numbers using Euclid's algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
