package arrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayListPractice {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        List<Integer> arr2 = new ArrayList<>();

        arr2.add(100);
        arr2.add(200);
        arr2.add(300);

        arr.addAll(2, arr2); // add all elements of arr2 in arr

        //practice rest methods of arrayList.

    }
}
