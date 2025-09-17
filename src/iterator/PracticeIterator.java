package iterator;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeIterator {
    /*
    * Topics:
    *  1. iterator()
    *  2. hasNext()
    *  3. next()
    *  4. remove()
    *  5. forEach() - here we use lambda function.
    * */
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        //using iterator.
        System.out.println("Iterating the method using iterator");
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()) {
            int val = valuesIterator.next();
            System.out.println(val);
            if(val == 3) {
                valuesIterator.remove();
            }
        }

        //using for each loop
        System.out.println("using for each loop");
        for(int val : values) {
            System.out.println(val);
        }

        //using for each method with lambda
        System.out.println("using forEach method");
        values.forEach((Integer val) -> System.out.println(val));
    }
}
