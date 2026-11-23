public class ReverseArray {
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; //creating numbers
        System.out.println("Original array:");
        displayArray(numbers);
        reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}
//Time Complexity: O(n)

//Explanation: For an array of size n, each recursive call moves the left pointer one step right and the right pointer one step left, performing about n/2 swaps in total. Since each swap takes constant time (O(1)), the total time complexity is O(n).

//Space Complexity (Additional Note): O(n) — Each recursive call uses a frame on the call stack, creating a recursion depth of about n/2