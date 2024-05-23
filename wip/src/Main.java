import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! \n");
        final double PI = 3.14159;
        final int SIZE = 20;
        double miles = 100.0;
        final double kilometers_per_mile = 1.609;
        double kilometers = miles * kilometers_per_mile;
        System.out.printf("\n km:" + kilometers);

        Scanner input = new Scanner(System.in);

        System.out.println("\n Enter a number for radius");
        double radius = input.nextDouble();

        double area = radius * radius * PI;
        System.out.println("\n  Circles radius is " + radius + " means that the area is " + area);

        int j;
        int k;
        int i = j = k = 2;
        System.out.println(i + "" + j + "" + k);
    }
}