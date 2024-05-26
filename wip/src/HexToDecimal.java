import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(hexString, 16);
            System.out.println("Hexadecimal: " + hexString);
            System.out.println("Decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Not a valid hexadecimal number.");
        }
    }
}
