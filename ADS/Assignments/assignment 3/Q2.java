//Q2. Check for balanced parentheses using a stack.

import java.util.*;
import java.util.Stack;

public class Q2 {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) 
                    return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) {
                    return false;  
                }
            }
        }
        return stack.isEmpty();  // Ensure all opening brackets are closed
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parentheses to check:");
        String str = sc.nextLine();

        System.out.println(isBalanced(str)); 

        sc.close();
    }
}
