public class dowhile {
    public static void main(String[] args) {
        int i = 1;
        long sum = 0;
        while (i <= 1000)
        {
            // statements
            sum = sum + i;
            i++;
            System.out.println("Sum + I:" + sum);
        }
        }
    }
/*
// original for loop
long sum = 0; for (int i = 0; i <= 1000; i++) sum = sum + i;
*/