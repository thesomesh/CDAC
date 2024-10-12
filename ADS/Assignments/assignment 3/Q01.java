//Q1.Implement a Stack using an array.

class Stack {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX];
    
    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if(top >= (MAX-1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    int pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top--];
    }

    void display() {
        if(isEmpty()) {
            System.out.println("Empty stack!");
        }
        else {
            System.out.println("Stack elements are:");
            show(top);
            System.out.println();
        }
    }

    void show(int index) {
        if(index < 0) 
            return;
        System.out.println(a[index] + "");
        show(index-1);
    }
}

public class Q01 {
    public static void main(String args[]) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        
        s1.display();
        
        s1.pop();
        s1.display();
        
        s1.push(15);
        s1.display();
    }
}
