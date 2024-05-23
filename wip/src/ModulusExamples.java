public class ModulusExamples {
    public static void main(String[] args) {
        // Modulus with negative integers
        int result1 = -7 % 3;
        int result2 = -12 % 4;
        int result3 = -26 % -8;
        int result4 = 20 % -13;

        System.out.println("-7 % 3 = " + result1);  // Output: -7 % 3 = -1
        System.out.println("-12 % 4 = " + result2); // Output: -12 % 4 = 0
        System.out.println("-26 % -8 = " + result3);// Output: -26 % -8 = -2
        System.out.println("20 % -13 = " + result4);// Output: 20 % -13 = 7

        // Modulus with floating-point values
        double result5 = 7.5 % 2.5;
        double result6 = -7.5 % 2.5;

        System.out.println("7.5 % 2.5 = " + result5);  // Output: 7.5 % 2.5 = 0.0
        System.out.println("-7.5 % 2.5 = " + result6); // Output: -7.5 % 2.5 = -2.5
    }
}
