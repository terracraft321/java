public class timer {
    public static void main(String[] args) {
        // Step 1: Obtain total milliseconds since midnight, January 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

// Step 2: Obtain total seconds by dividing totalMilliseconds by 1000
        long totalSeconds = totalMilliseconds / 1000;

// Step 3: Compute the current second
        int currentSecond = (int)(totalSeconds % 60);

// Step 4: Obtain total minutes by dividing totalSeconds by 60
        long totalMinutes = totalSeconds / 60;

// Step 5: Compute the current minute
        int currentMinute = (int)(totalMinutes % 60);

// Step 6: Obtain total hours by dividing totalMinutes by 60
        long totalHours = totalMinutes / 60;

// Step 7: Compute the current hour
        int currentHour = (int)(totalHours % 24);

// Display the results
        System.out.println("Current time: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
}
