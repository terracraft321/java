import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Eliminate duplicates
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the distinct numbers
        System.out.println("The distinct numbers are: " + Arrays.toString(distinctNumbers));

        scanner.close();
    }

    public static int[] eliminateDuplicates(int[] list) {
        // Sort the array to make duplicates adjacent
        Arrays.sort(list);

        // Count the number of distinct elements
        int count = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) {
                count++;
            }
        }

        // Create a new array to store the distinct elements
        int[] distinct = new int[count + 1];
        distinct[0] = list[0];
        int j = 1;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != list[i - 1]) {
                distinct[j++] = list[i];
            }
        }

        return distinct;
    }
}
