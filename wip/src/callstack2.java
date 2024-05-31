public class callstack2 {
    public static int max(int a, int b) {
        // Just as max is entered:
        // Call Stack:
        // max(a = 5, b = 10)
        // main() - args = [], x = 5, y = 10

        if (a > b) {
            // Just before max is returned (when a > b):
            // Call Stack:
            // max(a = 5, b = 10) - about to return 5
            // main() - args = [], x = 5, y = 10
            return a;
        } else {
            // Just before max is returned (when b > a):
            // Call Stack:
            // max(a = 5, b = 10) - about to return 10
            // main() - args = [], x = 5, y = 10
            return b;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Just before max is invoked:
        // Call Stack:
        // main() - args = [], x = 5, y = 10

        int result = max(x, y);

        // Right after max is returned:
        // Call Stack:
        // main() - args = [], x = 5, y = 10, result = 10

        System.out.println(result);  // Outputs 10
    }
}
