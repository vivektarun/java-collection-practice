package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PracticeQueue {
    /*
    * Features
    * 1. adding data in queue - insert the element into the queue | null element insertion is not allowed (NPE)
    *   a. add() - true if insertion is successful | exception if insertion fails
    *   b. offer() - true if insertion is successful | false if insertion fails.
    * 2. removing data from queue - Retrieves and removes the head of the queue
    *   a. poll() - return null if queue is empty
    *   b. remove() - return (NoSuchElementException) if queue is empty
    * 3. check the top value - Retrieves the data at the head of the queue but don't remove it.
    *   a. peak() - return null if queue is empty
    *   b. element() - return (NoSuchElementException) if queue is empty.
    * */
    public static void main(String[] args) {
        //We can make queue using linkedList concrete implementation or using ArrayDeque implementation.
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);

        q1.add(10);
        q1.add(20);
        q1.add(30);

    }
}
