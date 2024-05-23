public class boringincrements {
    public static void main(String[] args) {
        int a = 6;
        int b = a++; // Post-increment: b takes the original value of a, then a is incremented
        int c = ++a;
        System.out.println(a); // Output: 7
        System.out.println(b); // Output: 6

        a = 6;
        b = ++a; // Pre-increment: a is incremented first, then assigned to b
        System.out.println(a); // Output: 7
        System.out.println(b); // Output: 7

        double result = -b + 2 * b * b - (4 * a * c) / (2 * a);
        System.out.println(result);
        System.out.println(-result);


    }
}
