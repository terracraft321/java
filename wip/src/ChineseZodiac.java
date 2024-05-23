import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt(); // Read the user's input as an integer representing the year

        // Determine the Chinese Zodiac sign based on the year
        switch (year % 12) { // Calculate the remainder when the year is divided by 12
            case 0: System.out.println("Monkey"); break; // If the remainder is 0, output "Monkey"
            case 1: System.out.println("Rooster"); break; // If the remainder is 1, output "Rooster"
            case 2: System.out.println("Dog"); break; // If the remainder is 2, output "Dog"
            case 3: System.out.println("Pig"); break; // If the remainder is 3, output "Pig"
            case 4: System.out.println("Rat"); break; // If the remainder is 4, output "Rat"
            case 5: System.out.println("Ox"); break; // If the remainder is 5, output "Ox"
            case 6: System.out.println("Tiger"); break; // If the remainder is 6, output "Tiger"
            case 7: System.out.println("Rabbit"); break; // If the remainder is 7, output "Rabbit"
            case 8: System.out.println("Dragon"); break; // If the remainder is 8, output "Dragon"
            case 9: System.out.println("Snake"); break; // If the remainder is 9, output "Snake"
            case 10: System.out.println("Horse"); break; // If the remainder is 10, output "Horse"
            case 11: System.out.println("Sheep"); break; // If the remainder is 11, output "Sheep"
            default: System.out.println("Invalid year"); break; // Output "Invalid year" for other remainder values
        }
    }
}
