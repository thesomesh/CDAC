//Q3. Reverse a string using a stack.
import java.util.Stack;

public class Q3 {

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
		
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
		
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));  
    }
}
