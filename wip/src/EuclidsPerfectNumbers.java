public class EuclidsPerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 10,000:");

        // Iterate through numbers from 1 to 10,000 (mil?
        for (int i = 1; i <= 10000; i++) {
            // Check if the current number is perfect
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Find the divisors of the number and sum them
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number itself
        return sum == num;
    }
}
