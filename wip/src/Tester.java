import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE; // Initialize max to minimum possible integer value

        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("The largest number entered is: " + max);

        scanner.close(); // Close the Scanner object (optional but good practice)
    }
}
