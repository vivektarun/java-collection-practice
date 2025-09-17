package priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinPriorityQueuePractice {
    //Min priority queue means minimum elements first.
    //As we know it implements iterator and collection we will get all the methods of
    public static void main(String[] args) {
        // safer, hides implementation details, recommended for abstraction.
        // All the methods we have used in Queue - add(), poll(), peak(), offer() etc. we can use here
        Queue<Integer> pq = new PriorityQueue<>();

        // more power, but ties your code to that implementation. | get extra methods of priority queue
        // get some extra methods - comparator(), forEachRemaining() - read about all these methods.
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);


        pq.forEach((Integer val) -> System.out.println(val));

        while(!pq.isEmpty()) { // if queue is not empty
            int val = pq.poll();
            System.out.println("removed from front" + val);
        }
    }
}
