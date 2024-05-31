public class AnotherClass {
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int result = max(5, 2); // Invoking the max method
        System.out.println("Maximum value: " + result);
    }
}
