import java.util.InputMismatchException;
import java.util.Scanner;

public class Ohjelma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Ask the user for input
            System.out.print("Anna lainan määrä: ");
            double lainaMaara = scanner.nextDouble();

            System.out.print("Anna vuosikorko (%): ");
            double vuosikorko = scanner.nextDouble();

            System.out.print("Anna laina-aika vuosina: ");
            int vuodet = scanner.nextInt();

            if (lainaMaara <= 0 || vuosikorko <= 0 || vuodet <= 0) {
                throw new IllegalArgumentException("Lainan määrä, vuosikorko ja laina-aika vuosina on oltava suurempi kuin nolla.");
            }

            // Convert annual interest rate to a monthly interest rate
            double kuukausiKorko = vuosikorko / 100 / 12;

            // Calculate the monthly payment
            double kuukausiMaksu = lainaMaara * kuukausiKorko / (1 - 1 / Math.pow(1 + kuukausiKorko, vuodet * 12));

            // Calculate the total payment
            double maksuYhteensa = kuukausiMaksu * vuodet * 12;

            // Display the results
            System.out.println("Kuukausimaksu on " + (int)(kuukausiMaksu * 100) / 100.0);
            System.out.println("Maksat kaikkiaan " + (int)(maksuYhteensa * 100) / 100.0);

        } catch (InputMismatchException e) {
            System.out.println("Virheellinen syöte. Ole hyvä ja anna numerot.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
