import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Initialize variables to store the highest score and its corresponding student name
        int highestScore = Integer.MIN_VALUE; // Assume the lowest possible score initially
        String studentWithHighestScore = "";

        // Prompt the user to enter each student's name and score
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter student " + i + "'s name: ");
            String studentName = scanner.next(); // Read the student's name using next()

            System.out.print("Enter " + studentName + "'s score: ");
            int studentScore = scanner.nextInt();

            // Update the highest score and its corresponding student name if necessary
            if (studentScore > highestScore) {
                highestScore = studentScore;
                studentWithHighestScore = studentName;
            }
        }

        // Display the name of the student with the highest score
        System.out.println("The student with the highest score is: " + studentWithHighestScore);
    }
}
