// Snippet2.java
public class Snippet2 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i++);
            } else {
                i++;
            }
        }
    }
}
