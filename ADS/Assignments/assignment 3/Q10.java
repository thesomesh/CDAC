import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(12);
        maxHeap.add(7);
        maxHeap.add(15);
        maxHeap.add(5);
        System.out.println("Extracted Max = " + maxHeap.poll());
        System.out.println("Max-Heap = " + maxHeap);

        PriorityQueue<Integer> maxHeap2 = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap2.add(8);
        maxHeap2.add(20);
        maxHeap2.add(10);
        maxHeap2.add(3);
        System.out.println("Extracted Max = " + maxHeap2.poll());
        System.out.println("Max-Heap = " + maxHeap2);
    }
}
