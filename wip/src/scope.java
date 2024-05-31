public class scope {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");  // 'name' refers to the parameter
    }

    public static void main(String[] args) {
        String name = "Alice";  // 'name' is a local variable in 'main'
        greet(name);  // The 'name' variable from 'main' is passed to the 'greet' method
    }
}
