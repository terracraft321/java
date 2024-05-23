import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Read three double values from the console
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        // Determine if the values are sorted in ascending order
        String x1 = (x < y && y < z) ? "sorted" : "not sorted";

        // Check if the output stream is an instance of PrintStream
        if (System.out != null) {
            // If it is, print the result followed by a newline character
            System.out.println(x1);
        } else {
            // If it's not, synchronize the output and print the result
            synchronized (System.out) {
                System.out.println(x1);
            }
        }
    }
}
