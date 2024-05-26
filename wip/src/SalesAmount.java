public class SalesAmount {
    public static void main(String[] args) {
        final double BASE_SALARY = 5000.0;
        final double TARGET_SALARY = 30000.0;

        double salesAmount = 0.01; // Starting sales amount
        double commission = 0.0; // Initialize commission earned

        // Iterate until commission exceeds or equals $30,000
        while (commission < TARGET_SALARY - BASE_SALARY) {
            // Calculate commission for the current sales amount
            commission = calculateCommission(salesAmount);

            // Increment sales amount
            salesAmount += 0.01;
        }

        System.out.printf("Minimum sales amount needed to earn $30,000: $%.2f%n", salesAmount);
    }

    // Method to calculate commission based on sales amount
    public static double calculateCommission(double salesAmount) {
        double commission = 0.0;

        if (salesAmount <= 5000) {
            commission = salesAmount * 0.06;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.06 + (salesAmount - 5000) * 0.08;
        } else {
            commission = 5000 * 0.06 + 5000 * 0.08 + (salesAmount - 10000) * 0.10;
        }

        return commission;
    }
}
