import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        // Total number of seconds
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds =  input.nextInt();
        int minutes =  seconds / 60;
        int secondsremainder = minutes % 60;

        // Display the result
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes and " + secondsremainder + " seconds.");
    }
}
