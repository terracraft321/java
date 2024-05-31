public class MyClass {
    // Private method
    private void myPrivateMethod() {
        System.out.println("This is a private method.");
    }

    // Public method
    public void performAction() {
        // Call the private method
        myPrivateMethod();
        System.out.println("Action performed.");
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        MyClass obj = new MyClass();

        // Calling the public method
        obj.performAction(); // Client only sees and calls performAction
    }
}
