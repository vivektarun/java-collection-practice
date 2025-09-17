package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionPractice {
    /*
    *
    * */
    public static void main(String[] args) {
        // Add values in list.
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        //size - returns the size of the list
        System.out.println("size" + values.size());

        //isEmpty - true | false
        System.out.println("values array is empty : " + values.isEmpty());

        //contains - true | false
        System.out.println("values array contain 5 : " + values.contains(5));

        //add - use to add the element in the list
        values.add(6);
        System.out.println("value added in the list is : " + values.contains(6));

        //remove using index
        //element at index 3 will be removed
        values.remove(3);

        //remove using Object, removes the first occurrence of the value
        //when first 2(value) is found, it will be removed
        values.remove(Integer.valueOf(2));

        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(11);
        st.add(12);
        st.add(13);

        //addAll
        //All values of stack will be added in the values
        values.addAll(st);

        //If we have to check if all st element that we added in values array present or not
        //containAll
        System.out.println("addAll test using contain all" + values.containsAll(st));

        values.remove(Integer.valueOf(12)); // removed 12 from the values
        System.out.println("check for contain all: " + values.containsAll(st)); // as we deleted 12, it will return false.

        //removeAll
        values.removeAll(st); //Removes all the element of st from values array.

        //clear
        values.clear();
        System.out.println("is values array empty: " + values.isEmpty());

    }
}
