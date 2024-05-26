public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000.0; // Initial tuition
        double annualIncreaseRate = 0.06; // 6% annual increase
        int years = 10;

        // Calculate tuition in 10 years
        for (int i = 1; i <= years; i++) {
            tuition += tuition * annualIncreaseRate;
        }

        System.out.printf("Tuition in 10 years: $%.2f%n", tuition);

        // Calculate total cost of four years' worth of tuition after the tenth year
        double totalCost = 0.0;
        for (int i = 0; i < 4; i++) {
            totalCost += tuition;
            tuition += tuition * annualIncreaseRate;
        }

        System.out.printf("Total cost for four years' worth of tuition after 10 years: $%.2f%n", totalCost);
    }
}
