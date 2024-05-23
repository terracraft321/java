import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a random two-digit lottery number
        int lottery = (int)(Math.random() * 100);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get the digits from the lottery number
        int lotteryDigit1 = lottery / 10; // Extract the tens digit
        int lotteryDigit2 = lottery % 10; // Extract the ones digit

        // Get the digits from the user's guess
        int guessDigit1 = guess / 10; // Extract the tens digit
        int guessDigit2 = guess % 10; // Extract the ones digit

        // Output the lottery number
        System.out.println("The lottery number is " + lottery);

        // Check if the guess matches the lottery number
        if (guess == lottery) {
            // If the guess matches exactly, the user wins $10,000
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            // If the digits of the guess match the lottery number in reverse order, the user wins $3,000
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            // If at least one digit from the guess matches a digit from the lottery number, the user wins $1,000
            System.out.println("Match one digit: you win $1,000");
        } else {
            // If none of the above conditions are met, there is no match
            System.out.println("Sorry, no match");
        }
    }
}
