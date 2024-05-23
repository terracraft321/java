public class ifspecific {
    public static void main(String[] args) {
        // 3.3.1 Write an if statement that assigns 1 to x if y is greater than 0.
        int y = 0;
        int x = 0; // Initialize x
        int score = 95; // Example score
        double pay = 1000; // Example pay

        if (y > 0) {
            x = 1; // If y is greater than 0, assign 1 to x
        }

        // Print x value
        System.out.println("Value of x: " + x);

        // 3.3.2 Write an if statement that increases pay by 3% if score is greater than 90.
        if (score > 90) {
            pay *= 1.03; // If score is greater than 90, increase pay by 3%
        }

        // Print pay value
        System.out.println("Value of pay: " + pay);
    }
}
