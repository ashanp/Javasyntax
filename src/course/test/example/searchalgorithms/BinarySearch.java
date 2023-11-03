/*
 * - Binary search is an efficient search algorithm for sorted lists or arrays. It repeatedly divides the search space in half, 
 * eliminating half of the elements in each iteration. 
 * It has a time complexity of O(log n) in the worst case, making it much faster for large datasets compared to linear search.
 */

package course.test.example.searchalgorithms;

public class BinarySearch {

    // Binary search function to find an element in a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index where the target is found
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        int target = 10;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

