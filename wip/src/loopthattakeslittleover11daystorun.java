public class loopthattakeslittleover11daystorun {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++)
            for (int j = 0; j < 10000; j++)
                for (int k = 0; k < 10000; k++)
                    System.out.println(i + j + k);
    }
}