import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        // Maximum score
        final int MAX_SCORE = 100;

        // Initialize variables
        int totalScores = 0;
        int numberOfScores = 0;
        int belowAverageCount = 0;
        int aboveAverageCount = 0;

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter scores
        System.out.println("Enter scores (enter -1 to end input):");

        // Read scores until -1 is entered
        int score;
        do {
            score = scanner.nextInt();

            // Check if score is valid
            if (score >= 0 && score <= MAX_SCORE) {
                totalScores += score;
                numberOfScores++;

                // Check if score is below average
                if (score < (totalScores / numberOfScores)) {
                    belowAverageCount++;
                } else if (score > (totalScores / numberOfScores)) {
                    aboveAverageCount++;
                }
            } else if (score != -1) {
                System.out.println("Invalid score. Please enter a score between 0 and " + MAX_SCORE);
            }
        } while (score != -1);

        // Calculate average score
        double averageScore = (double) totalScores / numberOfScores;

        // Display results
        System.out.println("Average score: " + averageScore);
        System.out.println("Number of scores below average: " + belowAverageCount);
        System.out.println("Number of scores above average: " + aboveAverageCount);

        // Close the scanner
        scanner.close();
    }
}
