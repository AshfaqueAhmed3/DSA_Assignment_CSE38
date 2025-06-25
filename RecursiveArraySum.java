// Program is wrritin by Ashfaque Ahmed 2K24/CSE/38

// task 3 sum of all integer using Recursive arry method

public class RecursiveArraySum {
    public static void main(String[] args) {
        // integer example of  array
        int[] numbers = {3, 9, 13, 7};  

        // Calling recursive function to finding the sum
        int total = findSum(numbers, 0);

        // Print the total sum
        System.out.println("Sum of array elements is: " + total);
    }

    // The function is  adding elements one by one using recursion
    public static int findSum(int[] arr, int index) {
        // If index reaches end of array ret 0 and  (stop condition)
        if (index == arr.length) {
            return 0;
        } else {
            // Add current number + rest of the array
            return arr[index] + findSum(arr, index + 1);
        }
    }
}