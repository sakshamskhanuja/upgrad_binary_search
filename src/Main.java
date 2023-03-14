public class Main {

    public static void main(String[] args) {
        // Sorted integer array.
        int[] array = {1, 2, 4, 5, 7, 9, 11};

        // Prints the position of value 5 in the array.
        System.out.println(binarySearch(array, 9));
    }

    /**
     * Searches for the value in an integer via Binary Search.
     *
     * @param array Sorted integer array.
     * @param value Value to be searched in the array.
     * @return The index position of the value if found, otherwise, -1.
     */
    private static int binarySearch(int[] array, int value) {
        // Points to the left end of the array.
        int low = 0;

        // Points to the right end of the array.
        int high = array.length - 1;

        // Loop will continue to loops unless low becomes greater than high.
        while (low <= high) {
            // Stores the middle index.
            int middle = (low + high) / 2;

            // Stores the number at middle position.
            int middleNumber = array[middle];

            // Checks if value is equal to middleNumber.
            if (value == middleNumber) {
                return middle;
            } else if (value < middleNumber) {  // Checks if value is less than middleNumber.
                // high will be 1 left to the middle position.
                high = middle - 1;
            } else {    // value is greater than middleNumber.
                // low will be 1 right to the middle position.
                low = middle + 1;
            }
        }

        // value not found.
        return -1;
    }
}
