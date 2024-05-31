public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] target = new int[source.length];

        System.arraycopy(source, 0, target, 0, source.length);

        // Print the target array to verify the copy
        for (int i : target) {
            System.out.print(i + " ");
        }
    }
}
