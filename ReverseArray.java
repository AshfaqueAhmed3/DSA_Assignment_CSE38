// Program is wrritin by Ashfaque Ahmed 2K24/CSE/38
// task 1 reverse aryy using stack
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 80, 90};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Create  an  new stack 
        Stack<Integer> stack = new Stack<>();

        // Pushing  array elements into the  stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Pop the elements back into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
// for print 
        System.out.println("\nReversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}