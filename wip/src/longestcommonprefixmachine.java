import java.util.Scanner;
//order of words for 2 strings doesn't matter
public class longestcommonprefixmachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Find the longest common prefix of the two strings
        String commonPrefix = findLongestCommonPrefix(str1, str2);

        // Display the longest common prefix
        System.out.println("The longest common prefix is: " + commonPrefix);
    }

    // Method to find the longest common prefix of two strings
    public static String findLongestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int index = 0;

        // Compare characters of both strings until a character differs or until one string ends
        while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }

        // Return the substring up to the index where the characters differ
        return str1.substring(0, index);
    }
}
