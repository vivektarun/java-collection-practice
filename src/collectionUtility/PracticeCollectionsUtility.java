package collectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeCollectionsUtility {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println("max element: " + Collections.max(values));
        System.out.println("min element: " + Collections.min(values));
        Collections.sort(values);
        values.forEach((Integer val) -> System.out.println(val));

        //practice all methods.

    }

}
