public class NumericLiterals {
    public static void main(String[] args) {
        // Valid literals
        double validLiteral1 = 5_2534e+1; // 52534e+1
        int validLiteral2 = 5_2;          // 52

        // Invalid literals (commented out to avoid compilation errors)
        // double invalidLiteral1 = _2534; // Invalid: cannot start with an underscore
        // int invalidLiteral2 = 5_;       // Invalid: cannot end with an underscore

        // Print valid literals
        System.out.println("Valid Literal 1: " + validLiteral1);
        System.out.println("Valid Literal 2: " + validLiteral2);

        // Uncomment the following lines to see compilation errors
        // System.out.println("Invalid Literal 1: " + invalidLiteral1);
        // System.out.println("Invalid Literal 2: " + invalidLiteral2);
    }
}
