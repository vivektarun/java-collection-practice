package arrayDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class PracticeThreadSafe {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> pq = new ConcurrentLinkedDeque<>();
        pq.addFirst(1);
        pq.add(2); // it also add at first only
        pq.add(3);

        System.out.println(pq.removeLast());

    }
}
