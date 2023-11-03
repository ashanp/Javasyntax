/*Ternary search is a divide-and-conquer search algorithm used to find an element 
 * in a sorted array by dividing it into three parts and recursively searching in the appropriate third. 
 * It has a time complexity of O(log3 n). 
 */

package course.test.example.searchalgorithms;

public class TernarySearch {
    // Ternary search function to find an element in a sorted array
    public static int ternarySearch(int[] arr, int target) {
        return ternarySearch(arr, target, 0, arr.length - 1);
    }

    private static int ternarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }

        int third = (right - left) / 3;
        int mid1 = left + third;
        int mid2 = right - third;

        if (arr[mid1] == target) {
            return mid1; // Element found at mid1
        } else if (arr[mid2] == target) {
            return mid2; // Element found at mid2
        } else if (target < arr[mid1]) {
            return ternarySearch(arr, target, left, mid1 - 1);
        } else if (target > arr[mid2]) {
            return ternarySearch(arr, target, mid2 + 1, right);
        } else {
            return ternarySearch(arr, target, mid1 + 1, mid2 - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;

        int result = ternarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

