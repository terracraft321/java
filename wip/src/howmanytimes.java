public class howmanytimes {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++)
                System.out.println(i * j);
                // 45 times
    }
}
