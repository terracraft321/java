public class errors {
    public static void nPrintln(String message) {
        int n = 1;
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }

    public static void main(String[] args) {
        nPrintln("Welcome to Java!");
    }
}

//removed extra parameter that was unused