package arrayDeque;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class DequePractice {
    public static void main(String[] args) {
        //ArrayDeque as queue.
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();

        //Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(2);
        arrayDequeAsQueue.addLast(3);

        //Deletion
        int element = arrayDequeAsQueue.removeFirst();
        System.out.println(element);

        //getting the front element
        int ele = arrayDequeAsQueue.getFirst();
        System.out.println("front element" + ele);

        //ArrayDeque as stack.
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();

        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(2);
        arrayDequeAsStack.addFirst(3);


        //deletion
        int firstEle = arrayDequeAsStack.removeFirst();
        System.out.println("first element from stack" + firstEle);



    }
}
