public class Fix {
    public void method1(int n, int m) {
        n += m;
        int result = method2((int) 3.4);
        System.out.println("Result of method2: " + result);
    }

    public static int method2(int n) {
        if (n > 0) return 1;
        else if (n == 0) return 0;
        else if (n < 0) return -1;
        // Add a default return statement if none of the conditions are met
        return -999; // Example default value
    }

    public static void main(String[] args) {
        Fix fixInstance = new Fix();
        fixInstance.method1(5, 3);
    }
}
