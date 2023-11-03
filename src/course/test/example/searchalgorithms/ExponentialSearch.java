/*
 * - Exponential search is an algorithm that works by first finding an appropriate range and then performing a binary search within that range. 
 * It is particularly useful for unbounded arrays or lists.
 */

package course.test.example.searchalgorithms;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        if (arr[0] == target) {
            return 0; // Element found at the first position
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right);
            }

            return binarySearch(arr, target, left, mid - 1);
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int result = exponentialSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
