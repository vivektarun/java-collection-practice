package priorityQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PracticeThreadSafe {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(5);
        pq.add(6);

        System.out.println(pq.peek());
    }
}
