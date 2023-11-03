/*
 * Linear search, also known as sequential search, is a basic searching algorithm 
 * that scans through a list or array sequentially until the desired item is found. 
 * It has a time complexity of O(n) in the worst case, where n is the number of items in the collection.
 */

package course.test.example.searchalgorithms;

public class LinearSearch {

    // Linear search function to find an element in an array
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 15, 30, 20};
        int target = 15;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
