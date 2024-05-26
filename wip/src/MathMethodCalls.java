public class MathMethodCalls {

    public static void main(String[] args) {
        // 4.2.1 Evaluate the following method calls:
        System.out.println("a) Math.sqrt(4): " + Math.sqrt(4)); // Output: 2.0
        System.out.println("b) Math.sin(2 * Math.PI): " + Math.sin(2 * Math.PI)); // Output: 0.0
        System.out.println("c) Math.cos(2 * Math.PI): " + Math.cos(2 * Math.PI)); // Output: 1.0
        System.out.println("d) Math.pow(2, 2): " + Math.pow(2, 2)); // Output: 4.0
        System.out.println("e) Math.log(Math.E): " + Math.log(Math.E)); // Output: 1.0
        System.out.println("f) Math.exp(1): " + Math.exp(1)); // Output: 2.718281828459045
        System.out.println("g) Math.max(2, Math.min(3, 4)): " + Math.max(2, Math.min(3, 4))); // Output: 3
        System.out.println("h) Math.rint(-2.5): " + Math.rint(-2.5)); // Output: -2.0
        System.out.println("i) Math.ceil(-2.5): " + Math.ceil(-2.5)); // Output: -2.0
        System.out.println("j) Math.floor(-2.5): " + Math.floor(-2.5)); // Output: -3.0
        System.out.println("k) Math.round(-2.5f): " + Math.round(-2.5f)); // Output: -2
        System.out.println("l) Math.round(-2.5): " + Math.round(-2.5)); // Output: -3
        System.out.println("m) Math.rint(2.5): " + Math.rint(2.5)); // Output: 2.0
        System.out.println("n) Math.ceil(2.5): " + Math.ceil(2.5)); // Output: 3.0
        System.out.println("o) Math.floor(2.5): " + Math.floor(2.5)); // Output: 2.0
        System.out.println("p) Math.round(2.5f): " + Math.round(2.5f)); // Output: 3
        System.out.println("q) Math.round(2.5): " + Math.round(2.5)); // Output: 3
        System.out.println("r) Math.round(Math.abs(-2.5)): " + Math.round(Math.abs(-2.5))); // Output: 3

        // 4.2.2 True or false? The argument for trigonometric methods is an angle in radians.
        boolean isRadians = true; // True, the argument for trigonometric methods is an angle in radians

        // 4.2.3 Write a statement that converts 47 degrees to radians and assigns the result to a variable.
        double degrees = 47;
        double radians = Math.toRadians(degrees);

        // 4.2.4 Write a statement that converts PI / 7 to an angle in degrees and assigns the result to a variable.
        double angleInRadians = Math.PI / 7;
        double angleInDegrees = Math.toDegrees(angleInRadians);

        // 4.2.5 Write an expression that obtains a random integer between 34 and 55.
        int randomInt1 = 34 + (int) (Math.random() * (55 - 34 + 1));
        // Write an expression that obtains a random integer between 0 and 999.
        int randomInt2 = (int) (Math.random() * 1000);
        // Write an expression that obtains a random number between 5.5 and 55.5.
        double randomDouble = 5.5 + (Math.random() * (55.5 - 5.5));

        // 4.2.6 Why does the Math class not need to be imported?
        // The Math class is part of the java.lang package, which is automatically imported in every Java source file.

        // 4.2.7 What is Math.log(Math.exp(5.5))?
        double logExp = Math.log(Math.exp(5.5)); // log(exp(5.5)) = 5.5

        // What is Math.exp(Math.log(5.5))?
        double expLog = Math.exp(Math.log(5.5)); // exp(log(5.5)) = 5.5

        // What is Math.asin(Math.sin(Math.PI / 6))?
        double asinSin = Math.asin(Math.sin(Math.PI / 6)); // asin(sin(π/6)) = π/6

        // What is Math.sin(Math.asin(Math.PI / 6))?
        double sinAsin = Math.sin(Math.asin(Math.PI / 6)); // sin(asin(π/6)) = π/6
    }
}
