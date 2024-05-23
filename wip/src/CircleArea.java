import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double area = 0;

        // Check if radius is non-negative
        if (radius >= 0) {
            // Calculate the area of the circle
            area = radius * radius * Math.PI;
            // Display the result
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        } else {
            // Handle the case where the radius is negative
            System.out.println("Radius cannot be negative.");
        }


        // Close the scanner
        scanner.close();
    }
}
