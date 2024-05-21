public class Ohjelma {
    public static void main(String[] args) {
        // Define the necessary variables
        double lainaMaara = 10000; // Example loan amount
        double vuosikorko = 5; // Example annual interest rate in percentage
        int vuodet = 10; // Example number of years

        // Convert annual interest rate to a monthly interest rate
        double kuukausiKorko = vuosikorko / 100 / 12;

        // Calculate the monthly payment
        double kuukausiMaksu = lainaMaara * kuukausiKorko / (1 - 1 / Math.pow(1 + kuukausiKorko, vuodet * 12));

        // Calculate the total payment
        double maksuYhteensa = kuukausiMaksu * vuodet * 12;

        // Display the results
        System.out.println("Kuukausimaksu on " + (int)(kuukausiMaksu * 100) / 100.0);
        System.out.println("Maksat kaikkiaan " + (int)(maksuYhteensa * 100) / 100.0);
    }
}
