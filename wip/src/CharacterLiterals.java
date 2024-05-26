public class CharacterLiterals {

    public static void main(String[] args) {
        // 4.3.1 Which of the following are correct literals for characters?
        // '1', '\u345dE', '\u3fFa', '\b', '\t'
        // Correct literals: '1', '\b', '\t'

        // 4.3.2 How do you display the characters \ and "?"
        System.out.println("\\" + "\""); // Output: \"

        // 4.3.3 Use print statements to find out the ASCII code for ‘1’, ‘A’, ‘B’, ‘a’, and ‘b’.
        System.out.println("ASCII code for '1': " + (int) '1'); // Output: 49
        System.out.println("ASCII code for 'A': " + (int) 'A'); // Output: 65
        System.out.println("ASCII code for 'B': " + (int) 'B'); // Output: 66
        System.out.println("ASCII code for 'a': " + (int) 'a'); // Output: 97
        System.out.println("ASCII code for 'b': " + (int) 'b'); // Output: 98

        // Use print statements to find out the character for the decimal codes 40, 59, 79, 85, and 90.
        System.out.println("Character for ASCII code 40: " + (char) 40); // Output: (
        System.out.println("Character for ASCII code 59: " + (char) 59); // Output: ;
        System.out.println("Character for ASCII code 79: " + (char) 79); // Output: O
        System.out.println("Character for ASCII code 85: " + (char) 85); // Output: U
        System.out.println("Character for ASCII code 90: " + (char) 90); // Output: Z

        // Use print statements to find out the character for the hexadecimal codes 40, 5A, 71, 72, and 7A.
        System.out.println("Character for hexadecimal code 40: " + (char) 0x40); // Output: @
        System.out.println("Character for hexadecimal code 5A: " + (char) 0x5A); // Output: Z
        System.out.println("Character for hexadecimal code 71: " + (char) 0x71); // Output: q
        System.out.println("Character for hexadecimal code 72: " + (char) 0x72); // Output: r
        System.out.println("Character for hexadecimal code 7A: " + (char) 0x7A); // Output: z

        // 4.3.4 Evaluate the following:
        int i = '1'; // ASCII code for '1'
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a'; // ASCII code calculation
        int k = 'a'; // ASCII code for 'a'
        char c = 90; // Character with ASCII code 90 ('Z')

        // Print the results
        System.out.println("i: " + i); // Output: 49
        System.out.println("j: " + j); // Output: 99
        System.out.println("k: " + k); // Output: 97
        System.out.println("c: " + c); // Output: Z
    }
}
