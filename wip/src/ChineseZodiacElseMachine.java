import java.util.Scanner;

public class ChineseZodiacElseMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int zodiacIndex = year % 12;

        String zodiacSign;
        if (zodiacIndex == 0) {
            zodiacSign = "Monkey";
        } else if (zodiacIndex == 1) {
            zodiacSign = "Rooster";
        } else if (zodiacIndex == 2) {
            zodiacSign = "Dog";
        } else if (zodiacIndex == 3) {
            zodiacSign = "Pig";
        } else if (zodiacIndex == 4) {
            zodiacSign = "Rat";
        } else if (zodiacIndex == 5) {
            zodiacSign = "Ox";
        } else if (zodiacIndex == 6) {
            zodiacSign = "Tiger";
        } else if (zodiacIndex == 7) {
            zodiacSign = "Rabbit";
        } else if (zodiacIndex == 8) {
            zodiacSign = "Dragon";
        } else if (zodiacIndex == 9) {
            zodiacSign = "Snake";
        } else if (zodiacIndex == 10) {
            zodiacSign = "Horse";
        } else {
            zodiacSign = "Sheep";
        }

        System.out.println("The Chinese Zodiac sign for the year " + year + " is " + zodiacSign + ".");
    }
}
