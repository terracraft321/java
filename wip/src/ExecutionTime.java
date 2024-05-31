import java.util.Arrays;

public class ExecutionTime {
    public static void main(String[] args) {
        int[] array = new int[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        long startTime, endTime, executionTime;

        int[] searchKeys = {1, 25_000_000, 50_000_000, 75_000_000, 100_000_000};

        // Linear search
        System.out.println("Linear Search (Time Complexity: O(n), Space Complexity: O(1)):");
        for (int key : searchKeys) {
            startTime = System.nanoTime();
            int index = linearSearch(array, key);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            System.out.println("Search for " + key + ": Index found at " + index + ", Time taken: " + executionTime + " nanoseconds");
        }

        // Binary search (Requires the array to be sorted)
        Arrays.sort(array);
        System.out.println("\nBinary Search (Time Complexity: O(log n), Space Complexity: O(1)):");
        for (int key : searchKeys) {
            startTime = System.nanoTime();
            int index = Arrays.binarySearch(array, key);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            System.out.println("Search for " + key + ": Index found at " + index + ", Time taken: " + executionTime + " nanoseconds");
        }
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
