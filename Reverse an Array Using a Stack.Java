/*
 * Name: Hammad Ahmed
 * Roll Number: 2k24/CSE/62
 * Course: Data Structures and Algorithms
 * Assignment: 1
 */

import java.util.Stack;
import java.util.Arrays;

// 1. Program to reverse an array using a stack data structure.
public class ReverseArrayWithStack {

    /**
     * Reverses an array of integers using a Stack.
     * @param arr The integer array to be reversed.
     */
    public static void reverseIntegerArray(Integer[] arr) {
        // Use Java's built-in Stack class
        Stack<Integer> stack = new Stack<>();

        // Push all elements of the array onto the stack
        for (Integer element : arr) {
            stack.push(element);
        }

        // Pop all elements from the stack and put them back into the array
        // The LIFO (Last-In, First-Out) nature of the stack reverses the order.
        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }
    }

    /**
     * Reverses an array of strings using a Stack.
     * @param arr The String array to be reversed.
     */
    public static void reverseStringArray(String[] arr) {
        Stack<String> stack = new Stack<>();

        for (String element : arr) {
            stack.push(element);
        }

        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }
    }


    public static void main(String[] args) {
        // --- Example Usage ---

        // Example 1: Array of integers
        System.out.println("--- Example 1: Integer Array ---");
        Integer[] originalArray1 = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray1));
        reverseIntegerArray(originalArray1);
        System.out.println("Reversed Array: " + Arrays.toString(originalArray1));
        System.out.println("---------------------------------");


        // Example 2: Array of strings
        System.out.println("\n--- Example 2: String Array ---");
        String[] originalArray2 = {"apple", "banana", "cherry", "date"};
        System.out.println("Original Array: " + Arrays.toString(originalArray2));
        reverseStringArray(originalArray2);
        System.out.println("Reversed Array: " + Arrays.toString(originalArray2));
        System.out.println("---------------------------------");
    }
}

/*
--- Example Output ---
--- Example 1: Integer Array ---
Original Array: [1, 2, 3, 4, 5]
Reversed Array: [5, 4, 3, 2, 1]
---------------------------------

--- Example 2: String Array ---
Original Array: [apple, banana, cherry, date]
Reversed Array: [date, cherry, banana, apple]
---------------------------------
*/

