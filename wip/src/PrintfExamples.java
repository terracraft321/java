public class PrintfExamples {
    public static void main(String[] args) {
        // Corrected format specifier for floating-point numbers
        System.out.printf("%.2f\n%8.3f\n", 1.23456, 2.34);

        // Other examples from 4.6.3
        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");
        System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
        System.out.printf("%05d %06.1f\n", 32, 32.32);
    }
}
