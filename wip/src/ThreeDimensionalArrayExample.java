public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a three-dimensional array
        int[][][] array = new int[4][6][5];

        // Displaying the length of the array
        System.out.println("Length of the array: " + array.length);

        // Displaying the length of the second dimension of the array at index 2
        System.out.println("Length of the second dimension at index 2: " + array[2].length);

        // Displaying the length of the third dimension of the array at index [0][0]
        System.out.println("Length of the third dimension at index [0][0]: " + array[0][0].length);

        // Output of the given code
        int[][][] array2 = {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
        System.out.println(array2[0][0][0]); // Output: 1
        System.out.println(array2[1][1][1]); // Output: 8
    }
}
