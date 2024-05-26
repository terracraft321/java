public class LoopComparison {
    public static void main(String[] args) {
        System.out.println("Using break:");
        usingBreak();

        System.out.println("\nUsing continue:");
        usingContinue();
    }

    public static void usingBreak() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2) break;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }

    public static void usingContinue() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2) continue;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }
}
