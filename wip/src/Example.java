// Import the Date class from java.util package
import java.util.Date;

// Import the Point2D class from java.awt.geom package
import java.awt.geom.Point2D;

public class Example {
    public static void main(String[] args) {
        // 9.6.1 Create and display current date and time

        // Create a Date object representing the current date and time
        Date currentDate = new Date();

        // Print the current date and time to the console
        System.out.println("Current date and time: " + currentDate);

        // 9.6.2 Create Point2D objects

        // Create a Point2D.Double object p1 with coordinates (3, 4)
        Point2D.Double p1 = new Point2D.Double(3, 4);

        // Create another Point2D.Double object p2 with coordinates (7, 1)
        Point2D.Double p2 = new Point2D.Double(7, 1);

        // Calculate distance between p1 and p2
        double distance = p1.distance(p2);

        // Print the distance between p1 and p2 to the console
        System.out.println("Distance between p1 and p2: " + distance);

        // Calculate the x-coordinate of the midpoint between p1 and p2
        double midX = (p1.getX() + p2.getX()) / 2;

        // Calculate the y-coordinate of the midpoint between p1 and p2
        double midY = (p1.getY() + p2.getY()) / 2;

        // Create a new Point2D.Double object representing the midpoint
        Point2D.Double midpoint = new Point2D.Double(midX, midY);

        // Print the midpoint between p1 and p2 to the console
        System.out.println("Midpoint between p1 and p2: " + midpoint);
    }
}
