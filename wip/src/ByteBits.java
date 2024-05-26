import java.util.Scanner;

public class ByteBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a byte integer
        System.out.print("Enter a byte integer (0 to 255): ");
        int byteInteger = scanner.nextInt();

        // Display the 8 bits for the entered byte integer
        System.out.print("The 8 bits for the integer " + byteInteger + " are: ");
        for (int i = 7; i >= 0; i--) {
            int bit = (byteInteger >> i) & 1;
            System.out.print(bit);
        }
    }
}
