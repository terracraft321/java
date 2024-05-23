public class BooleanExpressions {
    public static void main(String[] args) {
        // 3.15.1 Precedence order of Boolean operators: !, &&, ||

        // 3.15.1 Expression evaluation
        boolean result1 = true || true && false; // true
        boolean result2 = true && true || false; // true

        // 3.15.2 True or false? All the binary operators except = are left associative.
        // True

        // 3.15.3 Expression evaluation
        boolean expression1 = 2 * 2 - 3 > 2 && 4 - 2 > 5; // false
        boolean expression2 = 2 * 2 - 3 > 2 || 4 - 2 > 5; // false

        // 3.15.4 Equality comparison
        int x = 5;
        int y = -5;
        boolean comparison1 = (x > 0 && x < 10) == ((x > 0) && (x < 10)); // true
        boolean comparison2 = (x > 0 || x < 10) == ((x > 0) || (x < 10)); // true
        boolean comparison3 = (x > 0 || x < 10 && y < 0) == (x > 0 || (x < 10 && y < 0)); // true

        // Output results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Expression 1: " + expression1);
        System.out.println("Expression 2: " + expression2);
        System.out.println("Comparison 1: " + comparison1);
        System.out.println("Comparison 2: " + comparison2);
        System.out.println("Comparison 3: " + comparison3);
    }
}
