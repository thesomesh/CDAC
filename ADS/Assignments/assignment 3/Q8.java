//8. Implement a Queue using two Stacks.

import java.util.Stack;

public class Q8 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Q8() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();
    }

    public void printQueue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue = [");
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i));
                if (i > 0 || !stack1.isEmpty()) System.out.print(", ");
            }
            for (int i = 0; i < stack1.size(); i++) {
                System.out.print(stack1.get(i));
                if (i < stack1.size() - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Q8 q = new Q8();
        q.enqueue(3);
        q.enqueue(7);
        q.printQueue();
        int dequeued = q.dequeue();
        System.out.println("Dequeued element = " + dequeued);
        q.printQueue();
    }
}
