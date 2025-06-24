/*
 * Name: Hammad Ahmed
 * Roll Number: 2k24/CSE/62
 * Course: Data Structures and Algorithms
 * Assignment: 1
 */

import java.util.Arrays;

// 3. Program to calculate the sum of all integer elements in an integer array
//    by implementing a recursive sum method/function.
public class RecursiveSum {

    /**
     * A helper function that implements the recursion.
     * @param arr The array of integers.
     * @param index The current index to start summing from.
     * @return The sum of elements from the current index to the end of the array.
     */
    private static int calculateSumHelper(int[] arr, int index) {
        // Base Case: If the index is at the end of the array, we're done.
        if (index == arr.length) {
            return 0;
        }
        // Recursive Step: Add the current element to the sum of the rest of the array.
        return arr[index] + calculateSumHelper(arr, index + 1);
    }

    /**
     * The public-facing method that initiates the recursive sum calculation.
     * @param arr The array of integers to sum up.
     * @return The total sum of all elements in the array.
     */
    public static int recursiveSum(int[] arr) {
        // Start the recursion from the first element (index 0).
        return calculateSumHelper(arr, 0);
    }

    public static void main(String[] args) {
        // --- Example Usage ---

        System.out.println("--- Example 1: Basic Array ---");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(myArray1));
        int totalSum1 = recursiveSum(myArray1);
        System.out.println("The recursive sum is: " + totalSum1);
        System.out.println("--------------------");

        System.out.println("\n--- Example 2: Array with Negative Numbers ---");
        int[] myArray2 = {10, -1, -5, 15, 3};
        System.out.println("Array: " + Arrays.toString(myArray2));
        int totalSum2 = recursiveSum(myArray2);
        System.out.println("The recursive sum is: " + totalSum2);
        System.out.println("--------------------");

        System.out.println("\n--- Example 3: Empty Array ---");
        int[] myArray3 = {};
        System.out.println("Array: " + Arrays.toString(myArray3));
        int totalSum3 = recursiveSum(myArray3);
        System.out.println("The recursive sum is: " + totalSum3);
        System.out.println("--------------------");
    }
}

/*
--- Example Output ---
--- Example 1: Basic Array ---
Array: [1, 2, 3, 4, 5]
The recursive sum is: 15
--------------------

--- Example 2: Array with Negative Numbers ---
Array: [10, -1, -5, 15, 3]
The recursive sum is: 22
--------------------

--- Example 3: Empty Array ---
Array: []
The recursive sum is: 0
--------------------
*/
