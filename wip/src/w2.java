public class w2 {
    public static void main(String[] args) {
        // today is 2
        // x in 100 days?

        int CurrentDay = 2;
         int NewDay = (2 + 100) % 7; // days in the week
                System.out.println("X in 100 days is going to be: " + NewDay + ", Thursday");
    }
}
