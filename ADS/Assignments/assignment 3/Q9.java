//9. Implement a Min-Heap.
  
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(20);
        minHeap.add(17);
        System.out.println("Extracted Min = " + minHeap.poll());  
        System.out.println("Min-Heap = " + minHeap);  

        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>();
        minHeap2.add(30);
        minHeap2.add(40);
        minHeap2.add(20);
        minHeap2.add(50);
        System.out.println("Extracted Min = " + minHeap2.poll());  
        System.out.println("Min-Heap = " + minHeap2);  
    }
}
