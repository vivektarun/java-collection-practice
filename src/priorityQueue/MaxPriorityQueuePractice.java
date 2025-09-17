package priorityQueue;

import java.util.PriorityQueue;

public class MaxPriorityQueuePractice {
    public static void main(String[] args) {
        //Max heap means max elemet first.
        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer a, Integer b) -> b-a);

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(7);

        pq.forEach((Integer val) -> System.out.println(val));

        while(!pq.isEmpty()) {
            int val = pq.poll();
            System.out.println("removed from top" + val);
        }

    }
}
