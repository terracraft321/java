import java.util.Scanner;

public class EnemyYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year (e.g., 2023): ");
        int birthYear = input.nextInt();

        // Find the Chinese zodiac sign for the entered year
        int zodiacIndex = (birthYear - 1900) % 12;
        String zodiacSign = getZodiacSign(zodiacIndex);

        // List the enemy zodiac signs for the entered year
        System.out.println("Your Chinese zodiac sign is: " + zodiacSign);
        System.out.println("Explanation of enemy years and advice:");

        for (int i = 1; i <= 100; i++) {
            int currentYear = birthYear + i;
            int zodiacIndexForYear = (currentYear - 1900) % 12;
            String enemyZodiacSign = getZodiacSign(zodiacIndexForYear);

            // Explanation of enemy years and advice based on Chinese zodiac tradition
            switch (zodiacSign) {
                case "Rat":
                    if (enemyZodiacSign.equals("Horse")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Rats and horses are considered enemies due to their conflicting personalities. Advice: Stay calm and avoid unnecessary conflicts.");
                    }
                    break;
                case "Ox":
                    if (enemyZodiacSign.equals("Goat")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Oxen and goats are believed to be enemies due to their contrasting traits. Advice: Be patient and avoid confrontations.");
                    }
                    break;
                case "Tiger":
                    if (enemyZodiacSign.equals("Monkey")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Tigers and monkeys are considered enemies due to their differing natures and behaviors. Advice: Focus on your goals and avoid distractions.");
                    }
                    break;
                case "Rabbit":
                    if (enemyZodiacSign.equals("Rooster")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Rabbits and roosters are believed to be enemies due to their conflicting personalities and habits. Advice: Be diplomatic and avoid conflicts.");
                    }
                    break;
                case "Dragon":
                    if (enemyZodiacSign.equals("Dog")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Dragons and dogs are considered enemies due to their clashing attitudes and behaviors. Advice: Be cautious and avoid risky ventures.");
                    }
                    break;
                case "Snake":
                    if (enemyZodiacSign.equals("Pig")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Snakes and pigs are believed to be enemies due to their differing approaches to life and conflicting interests. Advice: Focus on your own path and avoid distractions.");
                    }
                    break;
                case "Horse":
                    if (enemyZodiacSign.equals("Rat")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Horses and rats are considered enemies due to their clashing personalities and behaviors. Advice: Stay true to yourself and avoid being manipulated.");
                    }
                    break;
                case "Goat":
                    if (enemyZodiacSign.equals("Ox")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Goats and oxen are believed to be enemies due to their contrasting traits and behaviors. Advice: Be adaptable and avoid stubbornness.");
                    }
                    break;
                case "Monkey":
                    if (enemyZodiacSign.equals("Tiger")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Monkeys and tigers are considered enemies due to their differing natures and attitudes. Advice: Stay focused on your goals and avoid distractions.");
                    }
                    break;
                case "Rooster":
                    if (enemyZodiacSign.equals("Rabbit")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Roosters and rabbits are believed to be enemies due to their conflicting personalities and habits. Advice: Be diplomatic and avoid conflicts.");
                    }
                    break;
                case "Dog":
                    if (enemyZodiacSign.equals("Dragon")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Dogs and dragons are considered enemies due to their clashing attitudes and behaviors. Advice: Be cautious and avoid risky ventures.");
                    }
                    break;
                case "Pig":
                    if (enemyZodiacSign.equals("Snake")) {
                        System.out.println(currentYear + " (" + enemyZodiacSign + "): Pigs and snakes are believed to be enemies due to their differing approaches to life and conflicting interests. Advice: Focus on your own path and avoid distractions.");
                    }
                    break;
            }
        }
    }

    public static String getZodiacSign(int index) {
        String[] zodiacSigns = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        return zodiacSigns[index];
    }
}
