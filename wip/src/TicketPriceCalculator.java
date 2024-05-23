public class TicketPriceCalculator {
    public static void main(String[] args) {
        // Assume ages is the variable representing the age of the person
        int ages = 18; // For example

        // Original if-else statement
        /*if (ages >= 16) {
            ticketPrice = 20;
        } else {
            ticketPrice = 10;
        }*/

        // Using conditional operator to determine ticket price
        int ticketPrice = (ages >= 16) ? 20 : 10;

        // Output the ticket price
        System.out.println("Ticket price: $" + ticketPrice);
    }
}
