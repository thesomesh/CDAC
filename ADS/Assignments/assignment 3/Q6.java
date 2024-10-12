//6. Implement a Queue using an array.

public class Q6 {
    int size = 5;
    int CQ[] = new int[size];
    int front, rear;

    Q6() {
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return ((rear + 1) % size == front);
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            CQ[rear] = x;
            System.out.println("enqueue = " + x);
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int x = CQ[front];
            System.out.println("dequeue = " + x);
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return x;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (i != rear) {
                System.out.print(CQ[i] + " ");
                i = (i + 1) % size;
            }
            System.out.println(CQ[rear]);
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Q6 q1 = new Q6();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.dequeue();
        q1.display();
    }
}
