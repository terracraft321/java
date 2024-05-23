import java.util.Scanner;

public class fahrenheitcelsius {
    public static void main(String[] args) {
        System.out.println("Input Fahrenheit");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(" Fahrenheit " + fahrenheit + " is " + celsius + " in celsius");
    }
}
