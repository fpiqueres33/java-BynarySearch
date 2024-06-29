import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        Arrays.sort(array);  // Sort the array before performing binary search
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {9, 2, 4, 7, 3, 6, 1, 8, 5};  // Unsorted array
        int target = 4;
        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Array sorted: " + Arrays.toString(numbers));
            System.out.println("Element found at index: " + result);
        }
    }
}
