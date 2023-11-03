/*
 * Interpolation search is used to search for a specific element in a sorted array by estimating the position of the element 
 * based on its value and the range of values in the array. 
 * It can have an average-case time complexity of O(log log n) for uniformly distributed data.
 */

package course.test.example.searchalgorithms;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right && target >= arr[left] && target <= arr[right]) {
            if (left == right) {
                if (arr[left] == target) {
                    return left;
                }
                return -1; // Element not found
            }

            // Estimate the position of the target element
            int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);

            if (arr[pos] == target) {
                return pos; // Element found
            }

            if (arr[pos] < target) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 60;

        int result = interpolationSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
