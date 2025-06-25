// Program is wrritin by Ashfaque Ahmed 2K24/CSE/38


// task 2 match the perentheses using stack 

import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        String str = "(a+b)*(c-d)";  // this is  expression

        boolean balanced = true;  //  check if brackets are matched
        Stack<Character> stack = new Stack<>();  // creating stack to store the brackets '('

        // Go through the each character at the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // get the current character

            if (ch == '(') {
                stack.push(ch);  // pushin the opening bracket to stack
            } else if (ch == ')') {
                // if closing bracket found
                if (stack.isEmpty()) {
                    // no matching opening bracket if the brackets are not mach
                    balanced = false;
                    break;
                } else {
                    stack.pop();  // matched pair found or remove from stack
                }
            }
        }

        // stack is not empty afte loop then brackets are unbalanced
        if (!stack.isEmpty()) {
            balanced = false;
        }

        // Final result
        if (balanced) {
            System.out.println("Brackets are balanced.");  // all brackets matched
        } else {
            System.out.println("Brackets are NOT balanced.");  // all brackets matched
        }
    }
}